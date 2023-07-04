// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryPageSmartShortUrlLogResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryPageSmartShortUrlLogResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ClickState")
        public Long clickState;

        @NameInMap("ClickTime")
        public Long clickTime;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("ShortName")
        public String shortName;

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

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

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
