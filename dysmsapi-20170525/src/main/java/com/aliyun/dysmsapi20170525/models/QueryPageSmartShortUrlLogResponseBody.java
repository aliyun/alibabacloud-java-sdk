// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryPageSmartShortUrlLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryPageSmartShortUrlLogResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryPageSmartShortUrlLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPageSmartShortUrlLogResponseBody self = new QueryPageSmartShortUrlLogResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPageSmartShortUrlLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPageSmartShortUrlLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPageSmartShortUrlLogResponseBody setModel(QueryPageSmartShortUrlLogResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryPageSmartShortUrlLogResponseBodyModel getModel() {
        return this.model;
    }

    public QueryPageSmartShortUrlLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPageSmartShortUrlLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPageSmartShortUrlLogResponseBodyModelList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("ClickState")
        public Long clickState;

        /**
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("ClickTime")
        public Long clickTime;

        /**
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ShortName")
        public String shortName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ShortUrl")
        public String shortUrl;

        public static QueryPageSmartShortUrlLogResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryPageSmartShortUrlLogResponseBodyModelList self = new QueryPageSmartShortUrlLogResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public QueryPageSmartShortUrlLogResponseBodyModelList setClickState(Long clickState) {
            this.clickState = clickState;
            return this;
        }
        public Long getClickState() {
            return this.clickState;
        }

        public QueryPageSmartShortUrlLogResponseBodyModelList setClickTime(Long clickTime) {
            this.clickTime = clickTime;
            return this;
        }
        public Long getClickTime() {
            return this.clickTime;
        }

        public QueryPageSmartShortUrlLogResponseBodyModelList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryPageSmartShortUrlLogResponseBodyModelList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryPageSmartShortUrlLogResponseBodyModelList setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

        public QueryPageSmartShortUrlLogResponseBodyModelList setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

    }

    public static class QueryPageSmartShortUrlLogResponseBodyModel extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryPageSmartShortUrlLogResponseBodyModelList> list;

        /**
         * <strong>example:</strong>
         * <p>74</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("TotalPage")
        public Long totalPage;

        public static QueryPageSmartShortUrlLogResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryPageSmartShortUrlLogResponseBodyModel self = new QueryPageSmartShortUrlLogResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryPageSmartShortUrlLogResponseBodyModel setList(java.util.List<QueryPageSmartShortUrlLogResponseBodyModelList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryPageSmartShortUrlLogResponseBodyModelList> getList() {
            return this.list;
        }

        public QueryPageSmartShortUrlLogResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryPageSmartShortUrlLogResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryPageSmartShortUrlLogResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryPageSmartShortUrlLogResponseBodyModel setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
