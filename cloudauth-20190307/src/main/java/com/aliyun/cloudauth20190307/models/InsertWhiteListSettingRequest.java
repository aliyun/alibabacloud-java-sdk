// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InsertWhiteListSettingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>330103xxxxxxxxxxxx</p>
     */
    @NameInMap("CertNo")
    public String certNo;

    /**
     * <strong>example:</strong>
     * <p>shsf57a4e0d9981c3bd66dc754f3d3cd</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>100000xxxx</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ValidDay")
    public Integer validDay;

    public static InsertWhiteListSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertWhiteListSettingRequest self = new InsertWhiteListSettingRequest();
        return TeaModel.build(map, self);
    }

    public InsertWhiteListSettingRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InsertWhiteListSettingRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public InsertWhiteListSettingRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public InsertWhiteListSettingRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public InsertWhiteListSettingRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public InsertWhiteListSettingRequest setValidDay(Integer validDay) {
        this.validDay = validDay;
        return this;
    }
    public Integer getValidDay() {
        return this.validDay;
    }

}
