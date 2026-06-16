// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SizeChartDetectRequest extends TeaModel {
    /**
     * <p>The URL of the image to detect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i4/1822632490/O1CN01pbENR21UGT9w3a6gU_!!1822632490.jpg">https://img.alicdn.com/imgextra/i4/1822632490/O1CN01pbENR21UGT9w3a6gU_!!1822632490.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The detection threshold. Valid values: 0 to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Threshold")
    public Double threshold;

    public static SizeChartDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        SizeChartDetectRequest self = new SizeChartDetectRequest();
        return TeaModel.build(map, self);
    }

    public SizeChartDetectRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SizeChartDetectRequest setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

}
