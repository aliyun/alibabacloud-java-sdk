// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeKernelReleaseNotesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReleaseNotes")
    public DescribeKernelReleaseNotesResponseBodyReleaseNotes releaseNotes;

    public static DescribeKernelReleaseNotesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKernelReleaseNotesResponseBody self = new DescribeKernelReleaseNotesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKernelReleaseNotesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKernelReleaseNotesResponseBody setReleaseNotes(DescribeKernelReleaseNotesResponseBodyReleaseNotes releaseNotes) {
        this.releaseNotes = releaseNotes;
        return this;
    }
    public DescribeKernelReleaseNotesResponseBodyReleaseNotes getReleaseNotes() {
        return this.releaseNotes;
    }

    public static class DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote extends TeaModel {
        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("KernelVersion")
        public String kernelVersion;

        public static DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote build(java.util.Map<String, ?> map) throws Exception {
            DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote self = new DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote();
            return TeaModel.build(map, self);
        }

        public DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote setKernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }
        public String getKernelVersion() {
            return this.kernelVersion;
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
