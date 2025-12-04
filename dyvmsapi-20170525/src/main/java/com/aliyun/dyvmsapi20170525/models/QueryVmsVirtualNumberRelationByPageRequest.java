// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVmsVirtualNumberRelationByPageRequest extends TeaModel {
    /**
     * <p>号码归属地--城市</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("NumberCity")
    public String numberCity;

    /**
     * <p>号码归属地--省</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("NumberProvince")
    public String numberProvince;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>74</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <strong>example:</strong>
     * <p>81</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>真实号码</p>
     * 
     * <strong>example:</strong>
     * <p>131***1234</p>
     */
    @NameInMap("RealNumber")
    public String realNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>状态 1:有效；0:无效；-1:注销</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("State")
    public Long state;

    /**
     * <p>虚拟号码</p>
     * 
     * <strong>example:</strong>
     * <p>0571****1234</p>
     */
    @NameInMap("VirtualNumber")
    public String virtualNumber;

    public static QueryVmsVirtualNumberRelationByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVmsVirtualNumberRelationByPageRequest self = new QueryVmsVirtualNumberRelationByPageRequest();
        return TeaModel.build(map, self);
    }

    public QueryVmsVirtualNumberRelationByPageRequest setNumberCity(String numberCity) {
        this.numberCity = numberCity;
        return this;
    }
    public String getNumberCity() {
        return this.numberCity;
    }

    public QueryVmsVirtualNumberRelationByPageRequest setNumberProvince(String numberProvince) {
        this.numberProvince = numberProvince;
        return this;
    }
    public String getNumberProvince() {
        return this.numberProvince;
    }

    public QueryVmsVirtualNumberRelationByPageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryVmsVirtualNumberRelationByPageRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryVmsVirtualNumberRelationByPageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryVmsVirtualNumberRelationByPageRequest setRealNumber(String realNumber) {
        this.realNumber = realNumber;
        return this;
    }
    public String getRealNumber() {
        return this.realNumber;
    }

    public QueryVmsVirtualNumberRelationByPageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryVmsVirtualNumberRelationByPageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryVmsVirtualNumberRelationByPageRequest setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

    public QueryVmsVirtualNumberRelationByPageRequest setVirtualNumber(String virtualNumber) {
        this.virtualNumber = virtualNumber;
        return this;
    }
    public String getVirtualNumber() {
        return this.virtualNumber;
    }

}
