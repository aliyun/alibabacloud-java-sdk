// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateScheduledPreloadJobRequest extends TeaModel {
    /**
     * <p>The method to submit URLs to be prefetched.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>textBox</strong></li>
     * <li><strong>oss</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("InsertWay")
    public String insertWay;

    /**
     * <p>The name of the scheduled prefetch task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The URL of the OSS object that stores the URLs to be prefetched.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7">https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7</a></p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>190007158391808</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The URLs to be prefetched. This parameter is required if you set InsertWay to textBox.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://testurl.com/a.txt">http://testurl.com/a.txt</a>
     * <a href="http://testurl.com/b.txt">http://testurl.com/b.txt</a></p>
     */
    @NameInMap("UrlList")
    public String urlList;

    public static CreateScheduledPreloadJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledPreloadJobRequest self = new CreateScheduledPreloadJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledPreloadJobRequest setInsertWay(String insertWay) {
        this.insertWay = insertWay;
        return this;
    }
    public String getInsertWay() {
        return this.insertWay;
    }

    public CreateScheduledPreloadJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScheduledPreloadJobRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public CreateScheduledPreloadJobRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateScheduledPreloadJobRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

}
