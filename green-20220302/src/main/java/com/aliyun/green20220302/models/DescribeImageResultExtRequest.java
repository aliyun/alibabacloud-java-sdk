// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeImageResultExtRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>customImage,textInImage</p>
     */
    @NameInMap("InfoType")
    public String infoType;

    /**
     * <strong>example:</strong>
     * <p>638EDDC65C82AB39319A9F60</p>
     */
    @NameInMap("ReqId")
    public String reqId;

    public static DescribeImageResultExtRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageResultExtRequest self = new DescribeImageResultExtRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageResultExtRequest setInfoType(String infoType) {
        this.infoType = infoType;
        return this;
    }
    public String getInfoType() {
        return this.infoType;
    }

    public DescribeImageResultExtRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

}
