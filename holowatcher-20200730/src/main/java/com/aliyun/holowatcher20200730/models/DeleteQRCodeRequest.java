// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DeleteQRCodeRequest extends TeaModel {
    // sId
    @NameInMap("SId")
    public String SId;

    public static DeleteQRCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQRCodeRequest self = new DeleteQRCodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQRCodeRequest setSId(String SId) {
        this.SId = SId;
        return this;
    }
    public String getSId() {
        return this.SId;
    }

}
