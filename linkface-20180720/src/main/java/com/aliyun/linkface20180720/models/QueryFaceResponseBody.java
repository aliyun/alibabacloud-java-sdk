// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryFaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryFaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2DDC7526-5F3F-4002-B4C4-DBC118BE6DC5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceResponseBody self = new QueryFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryFaceResponseBody setData(QueryFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceResponseBodyDataUserFaceMetas extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("ClientTag")
        public String clientTag;

        /**
         * <strong>example:</strong>
         * <p><a href="http://linkface-test.oss-cn-shanghai.aliyuncs.com/4B79F609E129C592CDD2C36FE090864A.jpg?Expires=1531389394&OSSAccessKeyId=LTAIOK0Fpx51OQDq&Signature=Dl4RikFib3FPA7gj6ZP0x">http://linkface-test.oss-cn-shanghai.aliyuncs.com/4B79F609E129C592CDD2C36FE090864A.jpg?Expires=1531389394&amp;OSSAccessKeyId=LTAIOK0Fpx51OQDq&amp;Signature=Dl4RikFib3FPA7gj6ZP0x</a></p>
         */
        @NameInMap("FaceUrl")
        public String faceUrl;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("UserInfo")
        public String userInfo;

        public static QueryFaceResponseBodyDataUserFaceMetas build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceResponseBodyDataUserFaceMetas self = new QueryFaceResponseBodyDataUserFaceMetas();
            return TeaModel.build(map, self);
        }

        public QueryFaceResponseBodyDataUserFaceMetas setClientTag(String clientTag) {
            this.clientTag = clientTag;
            return this;
        }
        public String getClientTag() {
            return this.clientTag;
        }

        public QueryFaceResponseBodyDataUserFaceMetas setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public QueryFaceResponseBodyDataUserFaceMetas setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public QueryFaceResponseBodyDataUserFaceMetas setUserInfo(String userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public String getUserInfo() {
            return this.userInfo;
        }

    }

    public static class QueryFaceResponseBodyData extends TeaModel {
        @NameInMap("GroupIds")
        public java.util.List<String> groupIds;

        @NameInMap("UserFaceMetas")
        public java.util.List<QueryFaceResponseBodyDataUserFaceMetas> userFaceMetas;

        public static QueryFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceResponseBodyData self = new QueryFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceResponseBodyData setGroupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        public QueryFaceResponseBodyData setUserFaceMetas(java.util.List<QueryFaceResponseBodyDataUserFaceMetas> userFaceMetas) {
            this.userFaceMetas = userFaceMetas;
            return this;
        }
        public java.util.List<QueryFaceResponseBodyDataUserFaceMetas> getUserFaceMetas() {
            return this.userFaceMetas;
        }

    }

}
