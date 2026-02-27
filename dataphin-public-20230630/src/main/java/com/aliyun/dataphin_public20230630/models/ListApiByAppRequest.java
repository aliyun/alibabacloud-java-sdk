// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListApiByAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageQuery")
    public ListApiByAppRequestPageQuery pageQuery;

    public static ListApiByAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiByAppRequest self = new ListApiByAppRequest();
        return TeaModel.build(map, self);
    }

    public ListApiByAppRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListApiByAppRequest setPageQuery(ListApiByAppRequestPageQuery pageQuery) {
        this.pageQuery = pageQuery;
        return this;
    }
    public ListApiByAppRequestPageQuery getPageQuery() {
        return this.pageQuery;
    }

    public static class ListApiByAppRequestPageQuery extends TeaModel {
        /**
         * <p>appKey</p>
         * 
         * <strong>example:</strong>
         * <p>10121101</p>
         */
        @NameInMap("AppKey")
        @Deprecated
        public Long appKey;

        /**
         * <strong>example:</strong>
         * <p>app12345</p>
         */
        @NameInMap("AppKeyStr")
        public String appKeyStr;

        /**
         * <strong>example:</strong>
         * <p>apiName</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListApiByAppRequestPageQuery build(java.util.Map<String, ?> map) throws Exception {
            ListApiByAppRequestPageQuery self = new ListApiByAppRequestPageQuery();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public ListApiByAppRequestPageQuery setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public ListApiByAppRequestPageQuery setAppKeyStr(String appKeyStr) {
            this.appKeyStr = appKeyStr;
            return this;
        }
        public String getAppKeyStr() {
            return this.appKeyStr;
        }

        public ListApiByAppRequestPageQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListApiByAppRequestPageQuery setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListApiByAppRequestPageQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
