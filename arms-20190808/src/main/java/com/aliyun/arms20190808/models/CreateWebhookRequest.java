// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateWebhookRequest extends TeaModel {
    /**
     * <p>The notification template that is sent when an alert is triggered. This parameter is required if the <strong>Method</strong> parameter is set to <strong>Post</strong>. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Alert Name&quot;: &quot;{{ .commonLabels.alertname }}{{if .commonLabels.clustername }}&quot;, &quot;Cluster Name&quot;: &quot;{{ .commonLabels.clustername }} {{ end }}{{if eq &quot; app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}&quot;, &quot;Application Name&quot;: &quot;{{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}&quot;, &quot;Notification Policy&quot;: &quot;{{ .dispatchRuleName }}&quot;, &quot;Alarm Time&quot;: &quot;{{ .startTime }}&quot;, &quot;Alert Content&quot;: &quot;{{ for .alerts }} {{ .annotations.message }} {{ end }}&quot; }</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>The name of the contact.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WebhookAlert</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The HTTP request header.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Content-Type&quot;:&quot;application/json&quot;}]</p>
     */
    @NameInMap("HttpHeaders")
    public String httpHeaders;

    /**
     * <p>The parameters in the HTTP request.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;mike&quot;}]</p>
     */
    @NameInMap("HttpParams")
    public String httpParams;

    /**
     * <p>The HTTP request method.</p>
     * <ul>
     * <li><code>Get</code></li>
     * <li><code>Post</code></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Post</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The notification template that is sent when an alert is resolved. This parameter is required if the <strong>Method</strong> parameter is set to <strong>Post</strong>. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Alert Name&quot;: &quot;{{ .commonLabels.alertname }}{{if .commonLabels.clustername }}&quot;, &quot;Cluster Name&quot;: &quot;{{ .commonLabels.clustername }} {{ end }}{{if eq &quot; app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}&quot;, &quot;Application Name&quot;: &quot;{{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}&quot;, &quot;Notification Policy&quot;: &quot;{{ .dispatchRuleName }}&quot;, &quot;Alarm Time&quot;: &quot;{{ .startTime }}&quot;, &quot;Alert Content&quot;: &quot;{{ for .alerts }} {{ .annotations.message }} {{ end }}&quot; }</p>
     */
    @NameInMap("RecoverBody")
    public String recoverBody;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The URL of the request <strong>method</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=e1a049121ddbfce1ca963d115ef88cc7219583c4fb79fe6e398fbfb688">https://oapi.dingtalk.com/robot/send?access_token=e1a049121ddbfce1ca963d115ef88cc7219583c4fb79fe6e398fbfb688</a>******</p>
     */
    @NameInMap("Url")
    public String url;

    public static CreateWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebhookRequest self = new CreateWebhookRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebhookRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateWebhookRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateWebhookRequest setHttpHeaders(String httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }
    public String getHttpHeaders() {
        return this.httpHeaders;
    }

    public CreateWebhookRequest setHttpParams(String httpParams) {
        this.httpParams = httpParams;
        return this;
    }
    public String getHttpParams() {
        return this.httpParams;
    }

    public CreateWebhookRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CreateWebhookRequest setRecoverBody(String recoverBody) {
        this.recoverBody = recoverBody;
        return this;
    }
    public String getRecoverBody() {
        return this.recoverBody;
    }

    public CreateWebhookRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWebhookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
