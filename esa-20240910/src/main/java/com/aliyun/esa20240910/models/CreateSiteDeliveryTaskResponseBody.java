// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteDeliveryTaskResponseBody extends TeaModel {
    /**
     * <p>The data center. Valid values:</p>
     * <ul>
     * <li>cn: the Chinese mainland.</li>
     * <li>oversea: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9358E852-992D-5BC7-8BD7-975CA02773A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The website ID.<a href="~~2850189~~"></a></p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <p>The name of the delivery task.</p>
     * 
     * <strong>example:</strong>
     * <p>er-oss</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateSiteDeliveryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteDeliveryTaskResponseBody self = new CreateSiteDeliveryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSiteDeliveryTaskResponseBody setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public CreateSiteDeliveryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSiteDeliveryTaskResponseBody setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public CreateSiteDeliveryTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
