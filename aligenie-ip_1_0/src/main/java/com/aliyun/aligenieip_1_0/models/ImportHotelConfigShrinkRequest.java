// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportHotelConfigShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a7***83</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImportHotelConfig")
    public String importHotelConfigShrink;

    public static ImportHotelConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportHotelConfigShrinkRequest self = new ImportHotelConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportHotelConfigShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ImportHotelConfigShrinkRequest setImportHotelConfigShrink(String importHotelConfigShrink) {
        this.importHotelConfigShrink = importHotelConfigShrink;
        return this;
    }
    public String getImportHotelConfigShrink() {
        return this.importHotelConfigShrink;
    }

}
