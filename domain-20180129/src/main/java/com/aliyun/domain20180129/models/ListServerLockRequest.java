// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ListServerLockRequest extends TeaModel {
    /**
     * <p>The start of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-10 17:37:36</p>
     */
    @NameInMap("BeginStartDate")
    public Long beginStartDate;

    /**
     * <p>The domain name for which you want to query the enabled registry lock.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-10 17:37:36</p>
     */
    @NameInMap("EndExpireDate")
    public Long endExpireDate;

    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-10 17:37:36</p>
     */
    @NameInMap("EndStartDate")
    public Long endStartDate;

    /**
     * <p>The language of the error message to return if the request fails. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the product to which the domain name with the registry lock enabled belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1807**</p>
     */
    @NameInMap("LockProductId")
    public String lockProductId;

    /**
     * <p>The field that you use to sort the query results.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>EXPIRE_DATE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EXPIRE_DATE</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The order of the information based on which you want to sort the domain names, such as the registration date and expiration date. Valid values: ASC and DESC. The value ASC specifies the ascending order. The value DESC specifies the descending order. If this parameter is not configured, the default value DESC is used.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("OrderByType")
    public String orderByType;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the registry lock. Valid values:</p>
     * <ul>
     * <li>1: The registry lock is not enabled.</li>
     * <li>2: The registry lock is enabled.</li>
     * <li>3: The registry lock is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServerLockStatus")
    public Integer serverLockStatus;

    /**
     * <p>The start of the expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-10 17:37:36</p>
     */
    @NameInMap("StartExpireDate")
    public Long startExpireDate;

    /**
     * <p>The IP address of the client. For example, you can set the value to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static ListServerLockRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerLockRequest self = new ListServerLockRequest();
        return TeaModel.build(map, self);
    }

    public ListServerLockRequest setBeginStartDate(Long beginStartDate) {
        this.beginStartDate = beginStartDate;
        return this;
    }
    public Long getBeginStartDate() {
        return this.beginStartDate;
    }

    public ListServerLockRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ListServerLockRequest setEndExpireDate(Long endExpireDate) {
        this.endExpireDate = endExpireDate;
        return this;
    }
    public Long getEndExpireDate() {
        return this.endExpireDate;
    }

    public ListServerLockRequest setEndStartDate(Long endStartDate) {
        this.endStartDate = endStartDate;
        return this;
    }
    public Long getEndStartDate() {
        return this.endStartDate;
    }

    public ListServerLockRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListServerLockRequest setLockProductId(String lockProductId) {
        this.lockProductId = lockProductId;
        return this;
    }
    public String getLockProductId() {
        return this.lockProductId;
    }

    public ListServerLockRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListServerLockRequest setOrderByType(String orderByType) {
        this.orderByType = orderByType;
        return this;
    }
    public String getOrderByType() {
        return this.orderByType;
    }

    public ListServerLockRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListServerLockRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServerLockRequest setServerLockStatus(Integer serverLockStatus) {
        this.serverLockStatus = serverLockStatus;
        return this;
    }
    public Integer getServerLockStatus() {
        return this.serverLockStatus;
    }

    public ListServerLockRequest setStartExpireDate(Long startExpireDate) {
        this.startExpireDate = startExpireDate;
        return this;
    }
    public Long getStartExpireDate() {
        return this.startExpireDate;
    }

    public ListServerLockRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
