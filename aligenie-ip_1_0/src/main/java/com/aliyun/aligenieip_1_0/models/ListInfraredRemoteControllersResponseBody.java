// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListInfraredRemoteControllersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0C90A059-3653-5356-A78E-8A6BDA606155</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListInfraredRemoteControllersResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>3747</p>
         */
        @NameInMap("Rid")
        public Long rid;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
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
