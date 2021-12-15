// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DumpMetaResponseBody extends TeaModel {
    @NameInMap("Data")
    public DumpMetaResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DumpMetaStatus")
        public String dumpMetaStatus;

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
