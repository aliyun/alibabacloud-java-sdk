// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectSkinDiseaseAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0001</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageprocess/DetectSkinDisease/DetectSkinDisease1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageprocess/DetectSkinDisease/DetectSkinDisease1.png</a></p>
     */
    @NameInMap("Url")
    public java.io.InputStream urlObject;

    public static DetectSkinDiseaseAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectSkinDiseaseAdvanceRequest self = new DetectSkinDiseaseAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectSkinDiseaseAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectSkinDiseaseAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectSkinDiseaseAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

}
