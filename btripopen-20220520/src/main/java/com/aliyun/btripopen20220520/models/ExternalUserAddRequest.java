// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExternalUserAddRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2000-01-02</p>
     */
    @NameInMap("birthday")
    public String birthday;

    @NameInMap("cert_request_list")
    public java.util.List<ExternalUserAddRequestCertRequestList> certRequestList;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:zhangsan@alibaba-inc.com">zhangsan@alibaba-inc.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0012</p>
     */
    @NameInMap("external_user_id")
    public String externalUserId;

    /**
     * <strong>example:</strong>
     * <p>13438009765</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("real_name")
    public String realName;

    /**
     * <strong>example:</strong>
     * <p>zhang/san</p>
     */
    @NameInMap("real_name_en")
    public String realNameEn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("user_type")
    public Integer userType;

    public static ExternalUserAddRequest build(java.util.Map<String, ?> map) throws Exception {
        ExternalUserAddRequest self = new ExternalUserAddRequest();
        return TeaModel.build(map, self);
    }

    public ExternalUserAddRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public ExternalUserAddRequest setCertRequestList(java.util.List<ExternalUserAddRequestCertRequestList> certRequestList) {
        this.certRequestList = certRequestList;
        return this;
    }
    public java.util.List<ExternalUserAddRequestCertRequestList> getCertRequestList() {
        return this.certRequestList;
    }

    public ExternalUserAddRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ExternalUserAddRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public ExternalUserAddRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ExternalUserAddRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public ExternalUserAddRequest setRealNameEn(String realNameEn) {
        this.realNameEn = realNameEn;
        return this;
    }
    public String getRealNameEn() {
        return this.realNameEn;
    }

    public ExternalUserAddRequest setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }
    public Integer getUserType() {
        return this.userType;
    }

    public static class ExternalUserAddRequestCertRequestList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2034-10-01</p>
         */
        @NameInMap("cert_expired_time")
        public String certExpiredTime;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("cert_nation")
        public String certNation;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>330101199010010213</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality")
        public String nationality;

        public static ExternalUserAddRequestCertRequestList build(java.util.Map<String, ?> map) throws Exception {
            ExternalUserAddRequestCertRequestList self = new ExternalUserAddRequestCertRequestList();
            return TeaModel.build(map, self);
        }

        public ExternalUserAddRequestCertRequestList setCertExpiredTime(String certExpiredTime) {
            this.certExpiredTime = certExpiredTime;
            return this;
        }
        public String getCertExpiredTime() {
            return this.certExpiredTime;
        }

        public ExternalUserAddRequestCertRequestList setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public ExternalUserAddRequestCertRequestList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public ExternalUserAddRequestCertRequestList setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public ExternalUserAddRequestCertRequestList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

    }

}
