// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListServiceInstanceForPageRequest extends TeaModel {
    /**
     * <p>服务实例号</p>
     * 
     * <strong>example:</strong>
     * <p>0571****1234</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Pager")
    public ListServiceInstanceForPageRequestPager pager;

    /**
     * <p>关联实体号码</p>
     * 
     * <strong>example:</strong>
     * <p>131****1111</p>
     */
    @NameInMap("RelationNumber")
    public String relationNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>场景ID</p>
     * 
     * <strong>example:</strong>
     * <p>56</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>用途ID</p>
     * 
     * <strong>example:</strong>
     * <p>89</p>
     */
    @NameInMap("UsageId")
    public Long usageId;

    public static ListServiceInstanceForPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceForPageRequest self = new ListServiceInstanceForPageRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceForPageRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListServiceInstanceForPageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListServiceInstanceForPageRequest setPager(ListServiceInstanceForPageRequestPager pager) {
        this.pager = pager;
        return this;
    }
    public ListServiceInstanceForPageRequestPager getPager() {
        return this.pager;
    }

    public ListServiceInstanceForPageRequest setRelationNumber(String relationNumber) {
        this.relationNumber = relationNumber;
        return this;
    }
    public String getRelationNumber() {
        return this.relationNumber;
    }

    public ListServiceInstanceForPageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListServiceInstanceForPageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListServiceInstanceForPageRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public ListServiceInstanceForPageRequest setUsageId(Long usageId) {
        this.usageId = usageId;
        return this;
    }
    public Long getUsageId() {
        return this.usageId;
    }

    public static class ListServiceInstanceForPageRequestPager extends TeaModel {
        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageIndex")
        public Long pageIndex;

        /**
         * <p>每页数量，默认10，最大100</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        public static ListServiceInstanceForPageRequestPager build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceForPageRequestPager self = new ListServiceInstanceForPageRequestPager();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceForPageRequestPager setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListServiceInstanceForPageRequestPager setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
