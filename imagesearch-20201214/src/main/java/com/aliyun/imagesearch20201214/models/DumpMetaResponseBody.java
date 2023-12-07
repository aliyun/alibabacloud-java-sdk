// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DumpMetaResponseBody extends TeaModel {
    /**
     * <p>The information about the export task.</p>
     */
    @NameInMap("Data")
    public DumpMetaResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DumpMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DumpMetaResponseBody self = new DumpMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DumpMetaResponseBody setData(DumpMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DumpMetaResponseBodyData getData() {
        return this.data;
    }

    public DumpMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DumpMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DumpMetaResponseBodyData extends TeaModel {
        /**
         * <p>The status of the export task.</p>
         * <br>
         * <p>*   PROCESSING: in progress</p>
         * <p>*   FAIL: failed</p>
         * <p>*   SUCCESS: successful</p>
         */
        @NameInMap("DumpMetaStatus")
        public String dumpMetaStatus;

        /**
         * <p>The ID of the export task.</p>
         */
        @NameInMap("Id")
        public String id;

        public static DumpMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DumpMetaResponseBodyData self = new DumpMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DumpMetaResponseBodyData setDumpMetaStatus(String dumpMetaStatus) {
            this.dumpMetaStatus = dumpMetaStatus;
            return this;
        }
        public String getDumpMetaStatus() {
            return this.dumpMetaStatus;
        }

        public DumpMetaResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
