// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ListEmailVerificationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("BeginCreateTime")
    public Long beginCreateTime;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndCreateTime")
    public Long endCreateTime;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VerificationStatus")
    public Integer verificationStatus;

    public static ListEmailVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEmailVerificationRequest self = new ListEmailVerificationRequest();
        return TeaModel.build(map, self);
    }

    public ListEmailVerificationRequest setBeginCreateTime(Long beginCreateTime) {
        this.beginCreateTime = beginCreateTime;
        return this;
    }
    public Long getBeginCreateTime() {
        return this.beginCreateTime;
    }

    public ListEmailVerificationRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ListEmailVerificationRequest setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }
    public Long getEndCreateTime() {
        return this.endCreateTime;
    }

    public ListEmailVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListEmailVerificationRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListEmailVerificationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEmailVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public ListEmailVerificationRequest setVerificationStatus(Integer verificationStatus) {
        this.verificationStatus = verificationStatus;
        return this;
    }
    public Integer getVerificationStatus() {
        return this.verificationStatus;
    }

}
