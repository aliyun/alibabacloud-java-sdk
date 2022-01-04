// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListMetastoreCrawlerCreatorsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListMetastoreCrawlerCreatorsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMetastoreCrawlerCreatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetastoreCrawlerCreatorsResponseBody self = new ListMetastoreCrawlerCreatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetastoreCrawlerCreatorsResponseBody setData(java.util.List<ListMetastoreCrawlerCreatorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMetastoreCrawlerCreatorsResponseBodyData> getData() {
        return this.data;
    }

    public ListMetastoreCrawlerCreatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetastoreCrawlerCreatorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMetastoreCrawlerCreatorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetastoreCrawlerCreatorsResponseBodyData extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorLoginName")
        public String creatorLoginName;

        public static ListMetastoreCrawlerCreatorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetastoreCrawlerCreatorsResponseBodyData self = new ListMetastoreCrawlerCreatorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetastoreCrawlerCreatorsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListMetastoreCrawlerCreatorsResponseBodyData setCreatorLoginName(String creatorLoginName) {
            this.creatorLoginName = creatorLoginName;
            return this;
        }
        public String getCreatorLoginName() {
            return this.creatorLoginName;
        }

    }

}
