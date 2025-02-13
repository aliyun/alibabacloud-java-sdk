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
     * 
     * <strong>example:</strong>
     * <p>36C43E96-8F68-44AA-B1AF-B1F7AB94A6C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <ul>
         * <li>PROCESSING: in progress</li>
         * <li>FAIL: failed</li>
         * <li>SUCCESS: successful</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PROCESSING</p>
         */
        @NameInMap("DumpMetaStatus")
        public String dumpMetaStatus;

        /**
         * <p>The ID of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
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
