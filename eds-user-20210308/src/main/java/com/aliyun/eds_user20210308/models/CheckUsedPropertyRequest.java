// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CheckUsedPropertyRequest extends TeaModel {
    /**
     * <p>The ID of the property. You can call the <a href="https://help.aliyun.com/document_detail/410890.html">ListProperty</a> operation to query the property ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>390</p>
     */
    @NameInMap("PropertyId")
    public Long propertyId;

    public static CheckUsedPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUsedPropertyRequest self = new CheckUsedPropertyRequest();
        return TeaModel.build(map, self);
    }

    public CheckUsedPropertyRequest setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
        return this;
    }
    public Long getPropertyId() {
        return this.propertyId;
    }

}
