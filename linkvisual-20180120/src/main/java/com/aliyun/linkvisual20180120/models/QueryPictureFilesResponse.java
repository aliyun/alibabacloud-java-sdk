// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureFilesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryPictureFilesResponseData data;

    public static QueryPictureFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureFilesResponse self = new QueryPictureFilesResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureFilesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureFilesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPictureFilesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureFilesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureFilesResponse setData(QueryPictureFilesResponseData data) {
        this.data = data;
        return this;
    }
    public QueryPictureFilesResponseData getData() {
        return this.data;
    }

    public static class QueryPictureFilesResponseDataList extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("PicCreateTime")
        @Validation(required = true)
        public Long picCreateTime;

        @NameInMap("PicId")
        @Validation(required = true)
        public String picId;

        @NameInMap("PicUrl")
        @Validation(required = true)
        public String picUrl;

        @NameInMap("ThumbUrl")
        @Validation(required = true)
        public String thumbUrl;

        public static QueryPictureFilesResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureFilesResponseDataList self = new QueryPictureFilesResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryPictureFilesResponseDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryPictureFilesResponseDataList setPicCreateTime(Long picCreateTime) {
            this.picCreateTime = picCreateTime;
            return this;
        }
        public Long getPicCreateTime() {
            return this.picCreateTime;
        }

        public QueryPictureFilesResponseDataList setPicId(String picId) {
            this.picId = picId;
            return this;
        }
        public String getPicId() {
            return this.picId;
        }

        public QueryPictureFilesResponseDataList setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryPictureFilesResponseDataList setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }
        public String getThumbUrl() {
            return this.thumbUrl;
        }

    }

    public static class QueryPictureFilesResponseData extends TeaModel {
        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Page")
        @Validation(required = true)
        public Integer page;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryPictureFilesResponseDataList> list;

        public static QueryPictureFilesResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureFilesResponseData self = new QueryPictureFilesResponseData();
            return TeaModel.build(map, self);
        }

        public QueryPictureFilesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureFilesResponseData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryPictureFilesResponseData setList(java.util.List<QueryPictureFilesResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryPictureFilesResponseDataList> getList() {
            return this.list;
        }

    }

}
