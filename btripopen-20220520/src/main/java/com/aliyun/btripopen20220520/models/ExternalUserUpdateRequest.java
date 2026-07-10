// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExternalUserUpdateRequest extends TeaModel {
    @NameInMap("birthday")
    public String birthday;

    @NameInMap("cert_request_list")
    public java.util.List<ExternalUserUpdateRequestCertRequestList> certRequestList;

    @NameInMap("email")
    public String email;

    @NameInMap("phone")
    public String phone;

    @NameInMap("real_name")
    public String realName;

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
        @NameInMap("cert_expired_time")
        public String certExpiredTime;

        @NameInMap("cert_nation")
        public String certNation;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

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
