// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListSaseUserTagsResponseBody extends TeaModel {
    /**
     * <p>The list of user labels returned.</p>
     */
    @NameInMap("DataList")
    public java.util.List<ListSaseUserTagsResponseBodyDataList> dataList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E9D7ACD-53D5-56EF-A913-79D148D06299</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of user labels.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListSaseUserTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSaseUserTagsResponseBody self = new ListSaseUserTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSaseUserTagsResponseBody setDataList(java.util.List<ListSaseUserTagsResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListSaseUserTagsResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListSaseUserTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSaseUserTagsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListSaseUserTagsResponseBodyDataList extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>141681795035****</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>The number of users associated with the user label.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The description of the user label.</p>
         * 
         * <strong>example:</strong>
         * <p>These are the company\&quot;s employees</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the user label.</p>
         * 
         * <strong>example:</strong>
         * <p>boss</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user label ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su-tag-1ae52f66039fa0d4****</p>
         */
        @NameInMap("TagId")
        public String tagId;

        public static ListSaseUserTagsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSaseUserTagsResponseBodyDataList self = new ListSaseUserTagsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListSaseUserTagsResponseBodyDataList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public ListSaseUserTagsResponseBodyDataList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListSaseUserTagsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSaseUserTagsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSaseUserTagsResponseBodyDataList setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

    }

}
