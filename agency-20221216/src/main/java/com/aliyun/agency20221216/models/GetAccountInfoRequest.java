// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetAccountInfoRequest extends TeaModel {
    /**
     * <p>The current page number for pagination.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page for pagination. Maximum value: 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The UID of the distribution customer account. Either this parameter or the UserType parameter must be specified. If this parameter is empty, all distribution customer accounts of the specified UserType are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1215848086704806</p>
     */
    @NameInMap("Uid")
    public Long uid;

    /**
     * <p>The type of the distribution customer account. Valid values:</p>
     * <ul>
     * <li>1: End user.</li>
     * <li>2: Enterprise customer. </li>
     * <li>3: T2 partner.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static GetAccountInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountInfoRequest self = new GetAccountInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountInfoRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAccountInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAccountInfoRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public GetAccountInfoRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
