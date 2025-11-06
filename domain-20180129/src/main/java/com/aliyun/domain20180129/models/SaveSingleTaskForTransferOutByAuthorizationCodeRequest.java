// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForTransferOutByAuthorizationCodeRequest extends TeaModel {
    /**
     * <p>Schema of Response</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test2o#Lck</p>
     */
    @NameInMap("AuthorizationCode")
    public String authorizationCode;

    /**
     * <p>The transfer key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static SaveSingleTaskForTransferOutByAuthorizationCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForTransferOutByAuthorizationCodeRequest self = new SaveSingleTaskForTransferOutByAuthorizationCodeRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForTransferOutByAuthorizationCodeRequest setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public SaveSingleTaskForTransferOutByAuthorizationCodeRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
