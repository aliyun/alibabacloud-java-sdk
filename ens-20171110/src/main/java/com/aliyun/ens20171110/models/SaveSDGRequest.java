// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SaveSDGRequest extends TeaModel {
    /**
     * <p>The ID of the SDG to be saved.</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static SaveSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSDGRequest self = new SaveSDGRequest();
        return TeaModel.build(map, self);
    }

    public SaveSDGRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
