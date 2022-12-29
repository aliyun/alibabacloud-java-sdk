// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeKernelReleaseNotesResponseBody extends TeaModel {
    // The list of version release notes.
    @NameInMap("ReleaseNotes")
    public DescribeKernelReleaseNotesResponseBodyReleaseNotes releaseNotes;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKernelReleaseNotesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKernelReleaseNotesResponseBody self = new DescribeKernelReleaseNotesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKernelReleaseNotesResponseBody setReleaseNotes(DescribeKernelReleaseNotesResponseBodyReleaseNotes releaseNotes) {
        this.releaseNotes = releaseNotes;
        return this;
    }
    public DescribeKernelReleaseNotesResponseBodyReleaseNotes getReleaseNotes() {
        return this.releaseNotes;
    }

    public DescribeKernelReleaseNotesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote extends TeaModel {
        // The version number.
        @NameInMap("KernelVersion")
        public String kernelVersion;

        // Publishes the log.
        @NameInMap("ReleaseNote")
        public String releaseNote;

        public static DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote build(java.util.Map<String, ?> map) throws Exception {
            DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote self = new DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote();
            return TeaModel.build(map, self);
        }

        public DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote setKernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        public DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

    }

    public static class DescribeKernelReleaseNotesResponseBodyReleaseNotes extends TeaModel {
        @NameInMap("ReleaseNote")
        public java.util.List<DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote> releaseNote;

        public static DescribeKernelReleaseNotesResponseBodyReleaseNotes build(java.util.Map<String, ?> map) throws Exception {
            DescribeKernelReleaseNotesResponseBodyReleaseNotes self = new DescribeKernelReleaseNotesResponseBodyReleaseNotes();
            return TeaModel.build(map, self);
        }

        public DescribeKernelReleaseNotesResponseBodyReleaseNotes setReleaseNote(java.util.List<DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote> releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public java.util.List<DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote> getReleaseNote() {
            return this.releaseNote;
        }

    }

}
