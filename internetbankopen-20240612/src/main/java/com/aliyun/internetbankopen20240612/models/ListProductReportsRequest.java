// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.internetbankopen20240612.models;

import com.aliyun.tea.*;

public class ListProductReportsRequest extends TeaModel {
    /**
     * <p>Specifies whether to return only the most recent active epoch report. If this parameter is omitted or set to false, the operation returns active reports within the last ten completed natural weeks in UTC+8, up to ten records. If set to true, the operation queries the most recent active report from all completed historical epochs, returning at most one record without the ten-week limit. Only true or false is accepted. If a character string is passed, it must be strictly lowercase true or false. Other values return InvalidParameter.LatestOnly. This operation does not support paging.</p>
     */
    @NameInMap("LatestOnly")
    public Boolean latestOnly;

    /**
     * <p>The product code of the data product for which to query periodic reports. This must be consistent with the product code used when calling InvokeDataProduct. This parameter is required and allows only 1 to 128 ASCII letters, digits, periods (.), underscores (_), or hyphens (-). Leading and trailing spaces are not trimmed. If this parameter is missing or incorrectly formatted, InvalidParameter.ProductCode is returned. The query is limited to reports belonging to the current Alibaba Cloud account. If no available reports exist, an empty Reports array is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudsec.demo.v1</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static ListProductReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductReportsRequest self = new ListProductReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductReportsRequest setLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
        return this;
    }
    public Boolean getLatestOnly() {
        return this.latestOnly;
    }

    public ListProductReportsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
