// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Notification extends TeaModel {
    /**
     * <p>Use an Object Storage Service (OSS) file to receive task notifications. If you provide the URI of this file, detailed task execution information is written to the file in a JSON structure. Normally, you receive notifications through <a href="https://help.aliyun.com/document_detail/161886.html">EventBridge</a>, <a href="https://help.aliyun.com/document_detail/27412.html">MNS</a>, or <a href="https://help.aliyun.com/document_detail/29530.html">RocketMQ</a>. However, some tasks generate large amounts of information, such as archive previews or decompression tasks. For these tasks, provide this file to get the complete execution results.</p>
     * <p>The OSS URI format is oss\://${Bucket}/${Object}. <code>${Bucket}</code> is the name of an OSS bucket in the same region as the current project. <code>${Object}</code> is the full path of the file, including the file name extension.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This file is not a notification method. It only serves as a medium to receive detailed task execution information. Task status is sent through standard message notifications. This file contains only the detailed execution information.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.json</p>
     */
    @NameInMap("ExtendedMessageURI")
    public String extendedMessageURI;

    /**
     * <p>The MNS notification parameter object.</p>
     */
    @NameInMap("MNS")
    public MNS MNS;

    /**
     * <p>The RocketMQ notification parameter object.</p>
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
