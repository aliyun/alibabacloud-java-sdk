// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppResponseBody extends TeaModel {
    /**
     * <p>The ID of the app.</p>
     * 
     * <strong>example:</strong>
     * <p>110843374</p>
     */
    @NameInMap("AppId")
    public Long appId;

    /**
     * <p>The name of the app.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateApptest</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The time when the app was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-29T09:33:01Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The description of the app.</p>
     * 
     * <strong>example:</strong>
     * <p>Estimated on October 15, 2021 at 10:20:27</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>扩展信息</p>
     * 
     * <strong>example:</strong>
     * <p>110243810311</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The time when the app was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-29T09:33:01Z</p>
     */
    @NameInMap("ModifiedTime")
    public String modifiedTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DBDB3B0F-EC61-5F33-88AD-EC2446FA1DDB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResponseBody self = new DescribeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppResponseBody setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeAppResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeAppResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeAppResponseBody setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public DescribeAppResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
