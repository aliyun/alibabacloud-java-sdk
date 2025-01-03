// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemTimeTypeListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Invalid.IdNotFound</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>HC93CE1A-8D7A-13A9-8306-7465DE2E5C0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    @NameInMap("timeType")
    public java.util.List<GetWorkitemTimeTypeListResponseBodyTimeType> timeType;

    public static GetWorkitemTimeTypeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemTimeTypeListResponseBody self = new GetWorkitemTimeTypeListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkitemTimeTypeListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkitemTimeTypeListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetWorkitemTimeTypeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkitemTimeTypeListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetWorkitemTimeTypeListResponseBody setTimeType(java.util.List<GetWorkitemTimeTypeListResponseBodyTimeType> timeType) {
        this.timeType = timeType;
        return this;
    }
    public java.util.List<GetWorkitemTimeTypeListResponseBodyTimeType> getTimeType() {
        return this.timeType;
    }

    public static class GetWorkitemTimeTypeListResponseBodyTimeType extends TeaModel {
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>deploy</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>67fb001005aac8d3d2a3372416</p>
         */
        @NameInMap("identifier")
        public String identifier;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("position")
        public Long position;

        public static GetWorkitemTimeTypeListResponseBodyTimeType build(java.util.Map<String, ?> map) throws Exception {
            GetWorkitemTimeTypeListResponseBodyTimeType self = new GetWorkitemTimeTypeListResponseBodyTimeType();
            return TeaModel.build(map, self);
        }

        public GetWorkitemTimeTypeListResponseBodyTimeType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkitemTimeTypeListResponseBodyTimeType setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetWorkitemTimeTypeListResponseBodyTimeType setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetWorkitemTimeTypeListResponseBodyTimeType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkitemTimeTypeListResponseBodyTimeType setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

    }

}
