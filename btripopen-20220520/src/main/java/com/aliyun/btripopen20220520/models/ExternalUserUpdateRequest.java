// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExternalUserUpdateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2000-01-02</p>
     */
    @NameInMap("birthday")
    public String birthday;

    @NameInMap("cert_request_list")
    public java.util.List<ExternalUserUpdateRequestCertRequestList> certRequestList;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:zhangsan@alibaba-inc.com">zhangsan@alibaba-inc.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>13438009765</p>
     */
    @NameInMap("phone")
    public String phone;

    @NameInMap("real_name")
    public String realName;

    /**
     * <strong>example:</strong>
     * <p>zhang/san</p>
     */
    @NameInMap("real_name_en")
    public String realNameEn;

    public static ExternalUserUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExternalUserUpdateRequest self = new ExternalUserUpdateRequest();
        return TeaModel.build(map, self);
    }

    public ExternalUserUpdateRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public ExternalUserUpdateRequest setCertRequestList(java.util.List<ExternalUserUpdateRequestCertRequestList> certRequestList) {
        this.certRequestList = certRequestList;
        return this;
    }
    public java.util.List<ExternalUserUpdateRequestCertRequestList> getCertRequestList() {
        return this.certRequestList;
    }

    public ExternalUserUpdateRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ExternalUserUpdateRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ExternalUserUpdateRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public ExternalUserUpdateRequest setRealNameEn(String realNameEn) {
        this.realNameEn = realNameEn;
        return this;
    }
    public String getRealNameEn() {
        return this.realNameEn;
    }

    public static class ExternalUserUpdateRequestCertRequestList extends TeaModel {
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

        public static ExternalUserUpdateRequestCertRequestList build(java.util.Map<String, ?> map) throws Exception {
            ExternalUserUpdateRequestCertRequestList self = new ExternalUserUpdateRequestCertRequestList();
            return TeaModel.build(map, self);
        }

        public ExternalUserUpdateRequestCertRequestList setCertExpiredTime(String certExpiredTime) {
            this.certExpiredTime = certExpiredTime;
            return this;
        }
        public String getCertExpiredTime() {
            return this.certExpiredTime;
        }

        public ExternalUserUpdateRequestCertRequestList setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public ExternalUserUpdateRequestCertRequestList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public ExternalUserUpdateRequestCertRequestList setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public ExternalUserUpdateRequestCertRequestList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

    }

}
