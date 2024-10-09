// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QuerySessionByActivityIdPopResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("Data")
    public java.util.List<QuerySessionByActivityIdPopResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>1skladklasmda</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySessionByActivityIdPopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionByActivityIdPopResponseBody self = new QuerySessionByActivityIdPopResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySessionByActivityIdPopResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySessionByActivityIdPopResponseBody setData(java.util.List<QuerySessionByActivityIdPopResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySessionByActivityIdPopResponseBodyData> getData() {
        return this.data;
    }

    public QuerySessionByActivityIdPopResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QuerySessionByActivityIdPopResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QuerySessionByActivityIdPopResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QuerySessionByActivityIdPopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySessionByActivityIdPopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySessionByActivityIdPopResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("DescriptionEn")
        public String descriptionEn;

        /**
         * <strong>example:</strong>
         * <p>2024-09-25 14:11</p>
         */
        @NameInMap("EndDateTime")
        public String endDateTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>地点</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("NameEn")
        public String nameEn;

        /**
         * <strong>example:</strong>
         * <p>2024-09-25 14:11</p>
         */
        @NameInMap("StartDateTime")
        public String startDateTime;

        public static QuerySessionByActivityIdPopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySessionByActivityIdPopResponseBodyData self = new QuerySessionByActivityIdPopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySessionByActivityIdPopResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QuerySessionByActivityIdPopResponseBodyData setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        public QuerySessionByActivityIdPopResponseBodyData setEndDateTime(String endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }
        public String getEndDateTime() {
            return this.endDateTime;
        }

        public QuerySessionByActivityIdPopResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySessionByActivityIdPopResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QuerySessionByActivityIdPopResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySessionByActivityIdPopResponseBodyData setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public QuerySessionByActivityIdPopResponseBodyData setStartDateTime(String startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }
        public String getStartDateTime() {
            return this.startDateTime;
        }

    }

}
