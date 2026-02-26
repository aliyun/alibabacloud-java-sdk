// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Notification extends TeaModel {
    /**
     * <p>The Object Storage Service (OSS) URI of the object that stores task notifications. Task information is written to the object in the JSON format. In most cases, you can receive notifications only by using <a href="https://help.aliyun.com/document_detail/161886.html">EventBridge</a>, <a href="https://help.aliyun.com/document_detail/27412.html">Simple Message Queue</a>, or <a href="https://help.aliyun.com/document_detail/29530.html">ApsaraMQ for RocketMQ</a>. For tasks that have a large amount of task information, such as archive file inspection tasks and decompression tasks, you can use an OSS object to store detailed task information.</p>
     * <p>The OSS URI follows the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
     * <blockquote>
     * <p> The object is not a messaging method. It serves only as a container for detailed task information. Task status information is sent as a message, whereas the object stores detailed task information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.json</p>
     */
    @NameInMap("ExtendedMessageURI")
    public String extendedMessageURI;

    /**
     * <p>The SMQ notification settings.</p>
     */
    @NameInMap("MNS")
    public MNS MNS;

    /**
     * <p>The ApsaraMQ for RocketMQ notification settings.</p>
     */
    @NameInMap("RocketMQ")
    public RocketMQ rocketMQ;

    public static Notification build(java.util.Map<String, ?> map) throws Exception {
        Notification self = new Notification();
        return TeaModel.build(map, self);
    }

    public Notification setExtendedMessageURI(String extendedMessageURI) {
        this.extendedMessageURI = extendedMessageURI;
        return this;
    }
    public String getExtendedMessageURI() {
        return this.extendedMessageURI;
    }

    public Notification setMNS(MNS MNS) {
        this.MNS = MNS;
        return this;
    }
    public MNS getMNS() {
        return this.MNS;
    }

    public Notification setRocketMQ(RocketMQ rocketMQ) {
        this.rocketMQ = rocketMQ;
        return this;
    }
    public RocketMQ getRocketMQ() {
        return this.rocketMQ;
    }

}
