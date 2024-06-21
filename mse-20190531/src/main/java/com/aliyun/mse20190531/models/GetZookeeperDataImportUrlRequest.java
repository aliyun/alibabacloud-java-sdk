// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetZookeeperDataImportUrlRequest extends TeaModel {
    /**
     * <p>RestResult</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zip</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The type of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-zvp2xzzkk06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetZookeeperDataImportUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetZookeeperDataImportUrlRequest self = new GetZookeeperDataImportUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetZookeeperDataImportUrlRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetZookeeperDataImportUrlRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public GetZookeeperDataImportUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
