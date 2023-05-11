// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductFilterConfigRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product. A ProductKey is a GUID that is issued by IoT Platform to a product.</p>
     * <br>
     * <p>You can use the IoT Platform console or call the [QueryProductList](~~69271~~) operation to view the information about all products within the current account.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>Specifies whether to deduplicate messages based on the submission time of each property. Valid values:</p>
     * <br>
     * <p>*   **true**: deduplicates property messages that have the same timestamp.</p>
     * <p>*   **false**: does not deduplicate messages based on timestamps.</p>
     */
    @NameInMap("PropertyTimestampFilter")
    public Boolean propertyTimestampFilter;

    /**
     * <p>Specifies whether to deduplicate messages based on the value of each property. Valid values:</p>
     * <br>
     * <p>*   **true**: deduplicates property messages that have the same property value.</p>
     * <p>*   **false**: does not deduplicate messages based on property values.</p>
     */
    @NameInMap("PropertyValueFilter")
    public Boolean propertyValueFilter;

    public static UpdateProductFilterConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductFilterConfigRequest self = new UpdateProductFilterConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductFilterConfigRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateProductFilterConfigRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateProductFilterConfigRequest setPropertyTimestampFilter(Boolean propertyTimestampFilter) {
        this.propertyTimestampFilter = propertyTimestampFilter;
        return this;
    }
    public Boolean getPropertyTimestampFilter() {
        return this.propertyTimestampFilter;
    }

    public UpdateProductFilterConfigRequest setPropertyValueFilter(Boolean propertyValueFilter) {
        this.propertyValueFilter = propertyValueFilter;
        return this;
    }
    public Boolean getPropertyValueFilter() {
        return this.propertyValueFilter;
    }

}
