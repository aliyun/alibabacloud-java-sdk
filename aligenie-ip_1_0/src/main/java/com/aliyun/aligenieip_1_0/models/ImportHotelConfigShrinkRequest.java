// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportHotelConfigShrinkRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("ImportHotelConfigRequest")
    public String importHotelConfigRequestShrink;

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

    public ImportHotelConfigShrinkRequest setImportHotelConfigRequestShrink(String importHotelConfigRequestShrink) {
        this.importHotelConfigRequestShrink = importHotelConfigRequestShrink;
        return this;
    }
    public String getImportHotelConfigRequestShrink() {
        return this.importHotelConfigRequestShrink;
    }

}
