// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUserByDeviceIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0EC7*726E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public GetUserByDeviceIdResponseBodyResult result;

    public static GetUserByDeviceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserByDeviceIdResponseBody self = new GetUserByDeviceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserByDeviceIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetUserByDeviceIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserByDeviceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserByDeviceIdResponseBody setResult(GetUserByDeviceIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetUserByDeviceIdResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetUserByDeviceIdResponseBodyResultUserUnionIds extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>1553*B0C3</p>
         */
        @NameInMap("UserUnionId")
        public String userUnionId;

        public static GetUserByDeviceIdResponseBodyResultUserUnionIds build(java.util.Map<String, ?> map) throws Exception {
            GetUserByDeviceIdResponseBodyResultUserUnionIds self = new GetUserByDeviceIdResponseBodyResultUserUnionIds();
            return TeaModel.build(map, self);
        }

        public GetUserByDeviceIdResponseBodyResultUserUnionIds setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public GetUserByDeviceIdResponseBodyResultUserUnionIds setUserUnionId(String userUnionId) {
            this.userUnionId = userUnionId;
            return this;
        }
        public String getUserUnionId() {
            return this.userUnionId;
        }

    }

    public static class GetUserByDeviceIdResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0963*0158</p>
         */
        @NameInMap("UserOpenId")
        public String userOpenId;

        @NameInMap("UserUnionIds")
        public java.util.List<GetUserByDeviceIdResponseBodyResultUserUnionIds> userUnionIds;

        public static GetUserByDeviceIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetUserByDeviceIdResponseBodyResult self = new GetUserByDeviceIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetUserByDeviceIdResponseBodyResult setUserOpenId(String userOpenId) {
            this.userOpenId = userOpenId;
            return this;
        }
        public String getUserOpenId() {
            return this.userOpenId;
        }

        public GetUserByDeviceIdResponseBodyResult setUserUnionIds(java.util.List<GetUserByDeviceIdResponseBodyResultUserUnionIds> userUnionIds) {
            this.userUnionIds = userUnionIds;
            return this;
        }
        public java.util.List<GetUserByDeviceIdResponseBodyResultUserUnionIds> getUserUnionIds() {
            return this.userUnionIds;
        }

    }

}
