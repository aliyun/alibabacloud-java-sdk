// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductFilterConfigRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product. A ProductKey is a GUID that is issued by IoT Platform to a product.</p>
     * <p>You can use the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to view the information about all products within the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>Specifies whether to deduplicate messages based on the submission time of each property. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: deduplicates property messages that have the same timestamp.</li>
     * <li><strong>false</strong>: does not deduplicate messages based on timestamps.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PropertyTimestampFilter")
    public Boolean propertyTimestampFilter;

    /**
     * <p>Specifies whether to deduplicate messages based on the value of each property. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: deduplicates property messages that have the same property value.</li>
     * <li><strong>false</strong>: does not deduplicate messages based on property values.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
