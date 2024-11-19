// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTopicRequest extends TeaModel {
    @NameInMap("Codec")
    public String codec;

    /**
     * <p>The description of the topic category. The description must be 1 to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>resubmit a test topic</p>
     */
    @NameInMap("Desc")
    public String desc;

    @NameInMap("EnableProxySubscribe")
    public Boolean enableProxySubscribe;

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
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The operation permissions of the device on the topic category. Valid values:</p>
     * <ul>
     * <li><strong>SUB</strong>: Subscribe.</li>
     * <li><strong>PUB</strong>: Publish.</li>
     * <li><strong>ALL</strong>: Publish and Subscribe.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PUB</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The ID of the topic category that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>821****</p>
     */
    @NameInMap("TopicId")
    public String topicId;

    /**
     * <p>The name of the user-defined category level that you want to set. By default, a topic category includes the following levels: <em>productkey</em> and <em>devicename</em>. Separate the two levels with slashes (/). Format of a topic category: <code>productKey/deviceName/topicShortName</code>.</p>
     * <blockquote>
     * <p> Each level can contain letters, digits, and underscores (_), and cannot be empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>resubmit</p>
     */
    @NameInMap("TopicShortName")
    public String topicShortName;

    public static UpdateProductTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductTopicRequest self = new UpdateProductTopicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductTopicRequest setCodec(String codec) {
        this.codec = codec;
        return this;
    }
    public String getCodec() {
        return this.codec;
    }

    public UpdateProductTopicRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateProductTopicRequest setEnableProxySubscribe(Boolean enableProxySubscribe) {
        this.enableProxySubscribe = enableProxySubscribe;
        return this;
    }
    public Boolean getEnableProxySubscribe() {
        return this.enableProxySubscribe;
    }

    public UpdateProductTopicRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateProductTopicRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateProductTopicRequest setTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    public String getTopicId() {
        return this.topicId;
    }

    public UpdateProductTopicRequest setTopicShortName(String topicShortName) {
        this.topicShortName = topicShortName;
        return this;
    }
    public String getTopicShortName() {
        return this.topicShortName;
    }

}
