// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListInfraredRemoteControllersResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListInfraredRemoteControllersResponseBodyResult> result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static ListInfraredRemoteControllersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInfraredRemoteControllersResponseBody self = new ListInfraredRemoteControllersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInfraredRemoteControllersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInfraredRemoteControllersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInfraredRemoteControllersResponseBody setResult(java.util.List<ListInfraredRemoteControllersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInfraredRemoteControllersResponseBodyResult> getResult() {
        return this.result;
    }

    public ListInfraredRemoteControllersResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class ListInfraredRemoteControllersResponseBodyResult extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Rid")
        public Long rid;

        @NameInMap("Version")
        public String version;

        public static ListInfraredRemoteControllersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInfraredRemoteControllersResponseBodyResult self = new ListInfraredRemoteControllersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInfraredRemoteControllersResponseBodyResult setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListInfraredRemoteControllersResponseBodyResult setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public ListInfraredRemoteControllersResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
