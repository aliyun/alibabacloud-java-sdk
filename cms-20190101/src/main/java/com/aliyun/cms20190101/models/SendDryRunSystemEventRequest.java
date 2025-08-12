// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class SendDryRunSystemEventRequest extends TeaModel {
    /**
     * <p>The content of the system event.</p>
     * <blockquote>
     * <p> The value of this parameter is a JSON object. We recommend that you include the <code>product</code>, <code>resourceId</code>, and <code>regionId</code> fields in the JSON object.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;product&quot;:&quot;CloudMonitor&quot;,&quot;resourceId&quot;:&quot;acs:ecs:cn-hongkong:173651113438****:instance/{instanceId}&quot;,&quot;level&quot;:&quot;CRITICAL&quot;,&quot;instanceName&quot;:&quot;instanceName&quot;,&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;name&quot;:&quot;Agent_Status_Stopped&quot;,&quot;content&quot;:{&quot;ipGroup&quot;:&quot;0.0.0.0,0.0.0.1&quot;,&quot;tianjimonVersion&quot;:&quot;1.2.11&quot;},&quot;status&quot;:&quot;stopped&quot;}</p>
     */
    @NameInMap("EventContent")
    public String eventContent;

    /**
     * <p>The name of the system event.</p>
     * <blockquote>
     * <p> For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent_Status_Stopped</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The ID of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the cloud service.</p>
     * <blockquote>
     * <p> For information about the Alibaba Cloud services that are supported by CloudMonitor, see <a href="https://help.aliyun.com/document_detail/167388.html">Supported cloud services and their system events</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    public static SendDryRunSystemEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDryRunSystemEventRequest self = new SendDryRunSystemEventRequest();
        return TeaModel.build(map, self);
    }

    public SendDryRunSystemEventRequest setEventContent(String eventContent) {
        this.eventContent = eventContent;
        return this;
    }
    public String getEventContent() {
        return this.eventContent;
    }

    public SendDryRunSystemEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public SendDryRunSystemEventRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendDryRunSystemEventRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public SendDryRunSystemEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
