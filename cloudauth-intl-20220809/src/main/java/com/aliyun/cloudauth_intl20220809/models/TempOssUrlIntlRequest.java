// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class TempOssUrlIntlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250512/pdf/579047.pdf</p>
     */
    @NameInMap("ObjectName")
    public String objectName;

    public static TempOssUrlIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        TempOssUrlIntlRequest self = new TempOssUrlIntlRequest();
        return TeaModel.build(map, self);
    }

    public TempOssUrlIntlRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

}
