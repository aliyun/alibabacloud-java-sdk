// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateUserResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public CreateUserResponseBodyData data;

    /**
     * <p>id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>c26f36de-1ec8-496a-a828-880676c5ef81</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserResponseBody self = new CreateUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserResponseBody setData(CreateUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateUserResponseBodyData getData() {
        return this.data;
    }

    public CreateUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateUserResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("userId")
        public Long userId;

        public static CreateUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateUserResponseBodyData self = new CreateUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateUserResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
