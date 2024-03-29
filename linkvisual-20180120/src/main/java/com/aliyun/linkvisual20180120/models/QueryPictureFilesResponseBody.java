// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureFilesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryPictureFilesResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPictureFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureFilesResponseBody self = new QueryPictureFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPictureFilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureFilesResponseBody setData(QueryPictureFilesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPictureFilesResponseBodyData getData() {
        return this.data;
    }

    public QueryPictureFilesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPictureFilesResponseBodyDataList extends TeaModel {
        @NameInMap("IotId")
        public String iotId;

        @NameInMap("PicCreateTime")
        public Long picCreateTime;

        @NameInMap("PicId")
        public String picId;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("ThumbUrl")
        public String thumbUrl;

        public static QueryPictureFilesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureFilesResponseBodyDataList self = new QueryPictureFilesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryPictureFilesResponseBodyDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryPictureFilesResponseBodyDataList setPicCreateTime(Long picCreateTime) {
            this.picCreateTime = picCreateTime;
            return this;
        }
        public Long getPicCreateTime() {
            return this.picCreateTime;
        }

        public QueryPictureFilesResponseBodyDataList setPicId(String picId) {
            this.picId = picId;
            return this;
        }
        public String getPicId() {
            return this.picId;
        }

        public QueryPictureFilesResponseBodyDataList setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryPictureFilesResponseBodyDataList setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }
        public String getThumbUrl() {
            return this.thumbUrl;
        }

    }

    public static class QueryPictureFilesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryPictureFilesResponseBodyDataList> list;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static QueryPictureFilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureFilesResponseBodyData self = new QueryPictureFilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPictureFilesResponseBodyData setList(java.util.List<QueryPictureFilesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryPictureFilesResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryPictureFilesResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryPictureFilesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
