// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ListEmailVerificationRequest extends TeaModel {
    /**
     * <p>The start time for querying email verification creation, represented as the number of milliseconds since 00:00 on January 1, 1970, UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("BeginCreateTime")
    public Long beginCreateTime;

    /**
     * <p>The email address to query. You can upload only one email address at a time.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The end time for querying the creation of email verification, calculated as the number of milliseconds since 00:00 UTC on January 1, 1970.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndCreateTime")
    public Long endCreateTime;

    /**
     * <p>Language of error messages returned by the API. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.  </li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value is <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number for paging through the domain list. Default value is <strong>1</strong>. You can set this parameter based on your needs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The page size for paging through the domain list. Default value is <strong>500</strong>, and the maximum value is <strong>5000</strong>. You can set this parameter based on your needs.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>User IP address. You can set it to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>Email verification status. Valid values:  </p>
     * <ul>
     * <li><strong>0</strong>: Waiting for verification.  </li>
     * <li><strong>1</strong>: Verification succeeded.</li>
     * </ul>
     * 
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
