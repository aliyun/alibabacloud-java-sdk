// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCardSmsTemplateRequest extends TeaModel {
    /**
     * <p>The mobile phone manufacturer. Valid values:</p>
     * <ul>
     * <li><strong>HuaWei</strong>: HUAWEI</li>
     * <li><strong>XiaoMi</strong>: Xiaomi</li>
     * <li><strong>OPPO</strong>: OPPO</li>
     * <li><strong>VIVO</strong>: vivo</li>
     * <li><strong>MEIZU</strong>: MEIZU</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the system automatically specifies a supported mobile phone manufacturer.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>XiaoMi</p>
     */
    @NameInMap("Factorys")
    public String factorys;

    /**
     * <p>The description of the message template.</p>
     * 
     * <strong>example:</strong>
     * <p>Image and Text Template</p>
     */
    @NameInMap("Memo")
    public String memo;

    /**
     * <p>The content of the card message template.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>For information about fields such as Template, ExtendInfo, TemplateContent, TmpCard, and Action, see <a href="https://help.aliyun.com/document_detail/434929.html">Parameters of card message templates</a>.</p>
     * </li>
     * <li><p>Message template content varies based on the template type. For more information, see <a href="https://help.aliyun.com/document_detail/435361.html">Sample message templates</a>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *        &quot;extendInfo&quot;:{
     *               &quot;scene&quot;:&quot;HMOVM&quot;,
     *               &quot;purpose&quot;:&quot;2&quot;,
     *               &quot;userExt&quot;:{
     *                      &quot;outId&quot;:&quot;1234554321&quot;
     *               }
     *        },
     *        &quot;templateContent&quot;:{
     *               &quot;pages&quot;:[
     *                      {
     * &quot;tmpCards&quot;:[
     *                                    {
     *                                           &quot;type&quot;:&quot;IMAGE&quot;,
     *                                           &quot;srcType&quot;:1,
     *                                           &quot;src&quot;:&quot;28755&quot;,
     *                                           &quot;actionType&quot;:&quot;OPEN_APP&quot;,
     *                                           &quot;action&quot;:{
     *                                                  &quot;target&quot;:&quot;<a href="https://s.tb.cn/c.KxzZ">https://s.tb.cn/c.KxzZ</a>&quot;,
     *                                                  &quot;merchantName&quot;:&quot;test-template&quot;,
     *                                                  &quot;packageName&quot;:[
     *                                                         &quot;com.taobao.taobao&quot;],
     *                                                  &quot;floorUrl&quot;:&quot;<a href="https://s.tb.cn/c.KxzZ">https://s.tb.cn/c.KxzZ</a>&quot;
     *                                           },
     *                                           &quot;positionNumber&quot;:1
     *                                    },
     *                                    {
     *                                           &quot;type&quot;:&quot;TEXT&quot;,
     *                                           &quot;content&quot;:&quot;this is a test msg.&quot;,
     *                                           &quot;isTextTitle&quot;:true,
     *                                           &quot;positionNumber&quot;:2
     *                                    },
     *                                    {
     *                                           &quot;type&quot;:&quot;TEXT&quot;,
     *                                           &quot;content&quot;:&quot;Promotional information&quot;,
     *                                           &quot;isTextTitle&quot;:false,
     *                                           &quot;positionNumber&quot;:3
     *                                    },
     *                                    {
     *                                           &quot;type&quot;:&quot;BUTTON&quot;,
     *                                           &quot;content&quot;:&quot;Promotional information,&quot;,
     *                                           &quot;actionType&quot;:&quot;OPEN_BROWSER&quot;,
     *                                           &quot;action&quot;:{
     *                                                  &quot;target&quot;:&quot;<a href="https://www.aliyun.com">https://www.aliyun.com</a>&quot;,
     *                                                  &quot;merchantName&quot;:&quot;Currently on the Alibaba Cloud official website.&quot;
     * },
     *                                           &quot;positionNumber&quot;:4
     *                                    }]
     *                      }]
     *        },
     *        &quot;cardSignName&quot;:&quot;aliyun&quot;,
     *        &quot;cardType&quot;:5
     * }</p>
     */
    @NameInMap("Template")
    public java.util.Map<String, ?> template;

    /**
     * <p>The name of the card message template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun Image and Text Template</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static CreateCardSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCardSmsTemplateRequest self = new CreateCardSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCardSmsTemplateRequest setFactorys(String factorys) {
        this.factorys = factorys;
        return this;
    }
    public String getFactorys() {
        return this.factorys;
    }

    public CreateCardSmsTemplateRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateCardSmsTemplateRequest setTemplate(java.util.Map<String, ?> template) {
        this.template = template;
        return this;
    }
    public java.util.Map<String, ?> getTemplate() {
        return this.template;
    }

    public CreateCardSmsTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
