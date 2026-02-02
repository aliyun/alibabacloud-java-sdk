// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateChatSessionRequest extends TeaModel {
    /**
     * <p>需要在<a href="https://common-buy.aliyun.com/?spm=a2c4g.11186623.0.0.457876812ETi6y&commodityCode=avatar_2dchat_public_cn">数字人实时交互服务</a>购买完成对应的服务购买，当前有可用的服务时，前往阿里云-<a href="https://billing-cost.console.aliyun.com/order/list">我的订单</a>页面对应订单详情下进行查询</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-9t946y43m1d</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>灵眸平台颁发的个人凭证（在使用端渲染数字人的场景下必填）。</p>
     * 
     * <strong>example:</strong>
     * <p>b9be4b25c2d38c409c376ffd2372be1</p>
     */
    @NameInMap("license")
    public String license;

    /**
     * <p>运行SDK的平台（在使用端渲染数字人的场景下必填）。</p>
     * 
     * <strong>example:</strong>
     * <p>Web | Android | iOS</p>
     */
    @NameInMap("platform")
    public String platform;

    public static CreateChatSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatSessionRequest self = new CreateChatSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatSessionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateChatSessionRequest setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public CreateChatSessionRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
