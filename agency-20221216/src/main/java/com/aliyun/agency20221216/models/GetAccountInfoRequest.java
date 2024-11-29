// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetAccountInfoRequest extends TeaModel {
    /**
     * <p>Pagination, current page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Pagination, record number on each page, maximum 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Account UID of Distribution Customer. This parameter and the UserType parameter must have one filled. If this parameter is empty, then check all Distribution Customer accounts of the selected UserType.</p>
     * 
     * <strong>example:</strong>
     * <p>1215848086704806</p>
     */
    @NameInMap("Uid")
    public Long uid;

    /**
     * <p>Distribution Customer\&quot;s Account Type:</p>
     * <ul>
     * <li>1 End User</li>
     * <li>2 Enterprise</li>
     * <li>3 T2 Partner</li>
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
