// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserWafRulesetsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-xxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QueryArgs")
    public ListUserWafRulesetsRequestQueryArgs queryArgs;

    public static ListUserWafRulesetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserWafRulesetsRequest self = new ListUserWafRulesetsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserWafRulesetsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUserWafRulesetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserWafRulesetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserWafRulesetsRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ListUserWafRulesetsRequest setQueryArgs(ListUserWafRulesetsRequestQueryArgs queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public ListUserWafRulesetsRequestQueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    public static class ListUserWafRulesetsRequestQueryArgs extends TeaModel {
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NameLike")
        public String nameLike;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        public static ListUserWafRulesetsRequestQueryArgs build(java.util.Map<String, ?> map) throws Exception {
            ListUserWafRulesetsRequestQueryArgs self = new ListUserWafRulesetsRequestQueryArgs();
            return TeaModel.build(map, self);
        }

        public ListUserWafRulesetsRequestQueryArgs setDesc(Boolean desc) {
            this.desc = desc;
            return this;
        }
        public Boolean getDesc() {
            return this.desc;
        }

        public ListUserWafRulesetsRequestQueryArgs setNameLike(String nameLike) {
            this.nameLike = nameLike;
            return this;
        }
        public String getNameLike() {
            return this.nameLike;
        }

        public ListUserWafRulesetsRequestQueryArgs setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public String getOrderBy() {
            return this.orderBy;
        }

    }

}
