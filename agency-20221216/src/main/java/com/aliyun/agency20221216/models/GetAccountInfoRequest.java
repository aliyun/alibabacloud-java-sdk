// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetAccountInfoRequest extends TeaModel {
    /**
     * <p>Message</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Success</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>10 (Value &lt;= 20)</p>
     * 
     * <strong>example:</strong>
     * <p>1215848086704806</p>
     */
    @NameInMap("Uid")
    public Long uid;

    /**
     * <p>Result Code - Error Code. Value Range:</p>
     * <ul>
     * <li>200 OK</li>
     * <li>1109 System Error</li>
     * <li>3029: Invalid UID</li>
     * <li>3062: UID and UserType are both empty.</li>
     * <li>3063: UserType value out of range.</li>
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
