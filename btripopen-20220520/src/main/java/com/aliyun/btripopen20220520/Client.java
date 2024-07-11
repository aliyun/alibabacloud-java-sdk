// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520;

import com.aliyun.tea.*;
import com.aliyun.btripopen20220520.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("btripopen", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>summary</b> : 
     * <p>换取accessToken接口</p>
     * 
     * @param request AccessTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AccessTokenResponse
     */
    public AccessTokenResponse accessTokenWithOptions(AccessTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appSecret)) {
            query.put("app_secret", request.appSecret);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AccessToken"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/btrip-open-auth/v1/access-token/action/take"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AccessTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>换取accessToken接口</p>
     * 
     * @param request AccessTokenRequest
     * @return AccessTokenResponse
     */
    public AccessTokenResponse accessToken(AccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.accessTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建企业部门</p>
     * 
     * @param tmpReq AddDepartmentRequest
     * @param headers AddDepartmentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDepartmentResponse
     */
    public AddDepartmentResponse addDepartmentWithOptions(AddDepartmentRequest tmpReq, AddDepartmentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddDepartmentShrinkRequest request = new AddDepartmentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.managerEmployeeIdList)) {
            request.managerEmployeeIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.managerEmployeeIdList, "manager_employee_id_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deptName)) {
            body.put("dept_name", request.deptName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerEmployeeIdListShrink)) {
            body.put("manager_employee_id_list", request.managerEmployeeIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outDeptId)) {
            body.put("out_dept_id", request.outDeptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outDeptPid)) {
            body.put("out_dept_pid", request.outDeptPid);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDepartment"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/department/v2/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDepartmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建企业部门</p>
     * 
     * @param request AddDepartmentRequest
     * @return AddDepartmentResponse
     */
    public AddDepartmentResponse addDepartment(AddDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddDepartmentHeaders headers = new AddDepartmentHeaders();
        return this.addDepartmentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加员工</p>
     * 
     * @param tmpReq AddEmployeeRequest
     * @param headers AddEmployeeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddEmployeeResponse
     */
    public AddEmployeeResponse addEmployeeWithOptions(AddEmployeeRequest tmpReq, AddEmployeeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddEmployeeShrinkRequest request = new AddEmployeeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.baseCityCodeList)) {
            request.baseCityCodeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.baseCityCodeList, "base_city_code_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.certList)) {
            request.certListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.certList, "cert_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customRoleCodeList)) {
            request.customRoleCodeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customRoleCodeList, "custom_role_code_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outDeptIdList)) {
            request.outDeptIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outDeptIdList, "out_dept_id_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatar)) {
            body.put("avatar", request.avatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseCityCodeListShrink)) {
            body.put("base_city_code_list", request.baseCityCodeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.birthday)) {
            body.put("birthday", request.birthday);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certListShrink)) {
            body.put("cert_list", request.certListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customRoleCodeListShrink)) {
            body.put("custom_role_code_list", request.customRoleCodeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAdmin)) {
            body.put("is_admin", request.isAdmin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBoss)) {
            body.put("is_boss", request.isBoss);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDeptLeader)) {
            body.put("is_dept_leader", request.isDeptLeader);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobNo)) {
            body.put("job_no", request.jobNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerUserId)) {
            body.put("manager_user_id", request.managerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outDeptIdListShrink)) {
            body.put("out_dept_id_list", request.outDeptIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.positionLevel)) {
            body.put("position_level", request.positionLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realName)) {
            body.put("real_name", request.realName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realNameEn)) {
            body.put("real_name_en", request.realNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionId)) {
            body.put("union_id", request.unionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            body.put("user_nick", request.userNick);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEmployee"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/employee/v2/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEmployeeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加员工</p>
     * 
     * @param request AddEmployeeRequest
     * @return AddEmployeeResponse
     */
    public AddEmployeeResponse addEmployee(AddEmployeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddEmployeeHeaders headers = new AddEmployeeHeaders();
        return this.addEmployeeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增企业自定义角色下人员</p>
     * 
     * @param tmpReq AddEmployeesToCustomRoleRequest
     * @param headers AddEmployeesToCustomRoleHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddEmployeesToCustomRoleResponse
     */
    public AddEmployeesToCustomRoleResponse addEmployeesToCustomRoleWithOptions(AddEmployeesToCustomRoleRequest tmpReq, AddEmployeesToCustomRoleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddEmployeesToCustomRoleShrinkRequest request = new AddEmployeesToCustomRoleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIdList)) {
            request.userIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIdList, "user_id_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            body.put("role_id", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdListShrink)) {
            body.put("user_id_list", request.userIdListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEmployeesToCustomRole"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/role/v1/customRoleEmployees/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEmployeesToCustomRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增企业自定义角色下人员</p>
     * 
     * @param request AddEmployeesToCustomRoleRequest
     * @return AddEmployeesToCustomRoleResponse
     */
    public AddEmployeesToCustomRoleResponse addEmployeesToCustomRole(AddEmployeesToCustomRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddEmployeesToCustomRoleHeaders headers = new AddEmployeesToCustomRoleHeaders();
        return this.addEmployeesToCustomRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增发票抬头适用人员</p>
     * 
     * @param tmpReq AddInvoiceEntityRequest
     * @param headers AddInvoiceEntityHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddInvoiceEntityResponse
     */
    public AddInvoiceEntityResponse addInvoiceEntityWithOptions(AddInvoiceEntityRequest tmpReq, AddInvoiceEntityHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddInvoiceEntityShrinkRequest request = new AddInvoiceEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entities)) {
            request.entitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entities, "entities", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entitiesShrink)) {
            body.put("entities", request.entitiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddInvoiceEntity"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/entities"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddInvoiceEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增发票抬头适用人员</p>
     * 
     * @param request AddInvoiceEntityRequest
     * @return AddInvoiceEntityResponse
     */
    public AddInvoiceEntityResponse addInvoiceEntity(AddInvoiceEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddInvoiceEntityHeaders headers = new AddInvoiceEntityHeaders();
        return this.addInvoiceEntityWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>商旅功能页跳转</p>
     * 
     * @param request AddressGetRequest
     * @param headers AddressGetHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddressGetResponse
     */
    public AddressGetResponse addressGetWithOptions(AddressGetRequest request, AddressGetHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("action_type", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityCode)) {
            query.put("arr_city_code", request.arrCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityName)) {
            query.put("arr_city_name", request.arrCityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carScenesCode)) {
            query.put("car_scenes_code", request.carScenesCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityCode)) {
            query.put("dep_city_code", request.depCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityName)) {
            query.put("dep_city_name", request.depCityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            query.put("dep_date", request.depDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryId)) {
            query.put("itinerary_id", request.itineraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_Id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            query.put("sub_corp_id", request.subCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taobaoCallbackUrl)) {
            query.put("taobao_callback_url", request.taobaoCallbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerId)) {
            query.put("traveler_id", request.travelerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useBookingProxy)) {
            query.put("use_booking_proxy", request.useBookingProxy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddressGet"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/v1/address"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddressGetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>商旅功能页跳转</p>
     * 
     * @param request AddressGetRequest
     * @return AddressGetResponse
     */
    public AddressGetResponse addressGet(AddressGetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddressGetHeaders headers = new AddressGetHeaders();
        return this.addressGetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询机场数据</p>
     * 
     * @param request AirportSearchRequest
     * @param headers AirportSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AirportSearchResponse
     */
    public AirportSearchResponse airportSearchWithOptions(AirportSearchRequest request, AirportSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AirportSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/city/v1/airport"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AirportSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询机场数据</p>
     * 
     * @param request AirportSearchRequest
     * @return AirportSearchResponse
     */
    public AirportSearchResponse airportSearch(AirportSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AirportSearchHeaders headers = new AirportSearchHeaders();
        return this.airportSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>全量查询商旅城市行政区划编码信息</p>
     * 
     * @param headers AllBaseCityInfoQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllBaseCityInfoQueryResponse
     */
    public AllBaseCityInfoQueryResponse allBaseCityInfoQueryWithOptions(AllBaseCityInfoQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripAccessToken)) {
            realHeaders.put("x-acs-btrip-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllBaseCityInfoQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/city/v1/code"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllBaseCityInfoQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>全量查询商旅城市行政区划编码信息</p>
     * @return AllBaseCityInfoQueryResponse
     */
    public AllBaseCityInfoQueryResponse allBaseCityInfoQuery() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AllBaseCityInfoQueryHeaders headers = new AllBaseCityInfoQueryHeaders();
        return this.allBaseCityInfoQueryWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建出差审批单</p>
     * 
     * @param tmpReq ApplyAddRequest
     * @param headers ApplyAddHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyAddResponse
     */
    public ApplyAddResponse applyAddWithOptions(ApplyAddRequest tmpReq, ApplyAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyAddShrinkRequest request = new ApplyAddShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.carRule)) {
            request.carRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.carRule, "car_rule", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalTravelerList)) {
            request.externalTravelerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalTravelerList, "external_traveler_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalTravelerStandard)) {
            request.externalTravelerStandardShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalTravelerStandard, "external_traveler_standard", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelShare)) {
            request.hotelShareShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelShare, "hotel_share", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itineraryList)) {
            request.itineraryListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itineraryList, "itinerary_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itinerarySetList)) {
            request.itinerarySetListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itinerarySetList, "itinerary_set_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerList)) {
            request.travelerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerList, "traveler_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerStandard)) {
            request.travelerStandardShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerStandard, "traveler_standard", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.budget)) {
            body.put("budget", request.budget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budgetMerge)) {
            body.put("budget_merge", request.budgetMerge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carRuleShrink)) {
            body.put("car_rule", request.carRuleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            body.put("corp_name", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            body.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departName)) {
            body.put("depart_name", request.departName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendField)) {
            body.put("extend_field", request.extendField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTravelerListShrink)) {
            body.put("external_traveler_list", request.externalTravelerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTravelerStandardShrink)) {
            body.put("external_traveler_standard", request.externalTravelerStandardShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flightBudget)) {
            body.put("flight_budget", request.flightBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelBudget)) {
            body.put("hotel_budget", request.hotelBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelShareShrink)) {
            body.put("hotel_share", request.hotelShareShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internationalFlightCabins)) {
            body.put("international_flight_cabins", request.internationalFlightCabins);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryListShrink)) {
            body.put("itinerary_list", request.itineraryListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryRule)) {
            body.put("itinerary_rule", request.itineraryRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itinerarySetListShrink)) {
            body.put("itinerary_set_list", request.itinerarySetListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitTraveler)) {
            body.put("limit_traveler", request.limitTraveler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDepartmentId)) {
            body.put("payment_department_id", request.paymentDepartmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDepartmentName)) {
            body.put("payment_department_name", request.paymentDepartmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            body.put("sub_corp_id", request.subCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            body.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartBusinessId)) {
            body.put("thirdpart_business_id", request.thirdpartBusinessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartDepartId)) {
            body.put("thirdpart_depart_id", request.thirdpartDepartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.togetherBookRule)) {
            body.put("together_book_rule", request.togetherBookRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainBudget)) {
            body.put("train_budget", request.trainBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerListShrink)) {
            body.put("traveler_list", request.travelerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerStandardShrink)) {
            body.put("traveler_standard", request.travelerStandardShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripCause)) {
            body.put("trip_cause", request.tripCause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripDay)) {
            body.put("trip_day", request.tripDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripTitle)) {
            body.put("trip_title", request.tripTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionNo)) {
            body.put("union_no", request.unionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("user_name", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleBudget)) {
            body.put("vehicle_budget", request.vehicleBudget);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/biz-trip"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAddResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建出差审批单</p>
     * 
     * @param request ApplyAddRequest
     * @return ApplyAddResponse
     */
    public ApplyAddResponse applyAdd(ApplyAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyAddHeaders headers = new ApplyAddHeaders();
        return this.applyAddWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新出差审批单（状态）</p>
     * 
     * @param request ApplyApproveRequest
     * @param headers ApplyApproveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyApproveResponse
     */
    public ApplyApproveResponse applyApproveWithOptions(ApplyApproveRequest request, ApplyApproveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            body.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            body.put("note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTime)) {
            body.put("operate_time", request.operateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            body.put("sub_corp_id", request.subCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("user_name", request.userName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyApprove"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/biz-trip/action/approve"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyApproveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新出差审批单（状态）</p>
     * 
     * @param request ApplyApproveRequest
     * @return ApplyApproveResponse
     */
    public ApplyApproveResponse applyApprove(ApplyApproveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyApproveHeaders headers = new ApplyApproveHeaders();
        return this.applyApproveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>外部审批节点状态同步</p>
     * 
     * @param tmpReq ApplyExternalNodeStatusUpdateRequest
     * @param headers ApplyExternalNodeStatusUpdateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyExternalNodeStatusUpdateResponse
     */
    public ApplyExternalNodeStatusUpdateResponse applyExternalNodeStatusUpdateWithOptions(ApplyExternalNodeStatusUpdateRequest tmpReq, ApplyExternalNodeStatusUpdateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyExternalNodeStatusUpdateShrinkRequest request = new ApplyExternalNodeStatusUpdateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationRecords)) {
            request.operationRecordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationRecords, "operation_records", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("node_id", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationRecordsShrink)) {
            body.put("operation_records", request.operationRecordsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processActionResult)) {
            body.put("process_action_result", request.processActionResult);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyExternalNodeStatusUpdate"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/external-nodes/action/status-update"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyExternalNodeStatusUpdateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>外部审批节点状态同步</p>
     * 
     * @param request ApplyExternalNodeStatusUpdateRequest
     * @return ApplyExternalNodeStatusUpdateResponse
     */
    public ApplyExternalNodeStatusUpdateResponse applyExternalNodeStatusUpdate(ApplyExternalNodeStatusUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyExternalNodeStatusUpdateHeaders headers = new ApplyExternalNodeStatusUpdateHeaders();
        return this.applyExternalNodeStatusUpdateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申请发票</p>
     * 
     * @param tmpReq ApplyInvoiceTaskRequest
     * @param headers ApplyInvoiceTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyInvoiceTaskResponse
     */
    public ApplyInvoiceTaskResponse applyInvoiceTaskWithOptions(ApplyInvoiceTaskRequest tmpReq, ApplyInvoiceTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyInvoiceTaskShrinkRequest request = new ApplyInvoiceTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.invoiceTaskList)) {
            request.invoiceTaskListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.invoiceTaskList, "invoice_task_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            body.put("bill_date", request.billDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceTaskListShrink)) {
            body.put("invoice_task_list", request.invoiceTaskListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyInvoiceTask"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/apply-invoice-task"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyInvoiceTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请发票</p>
     * 
     * @param request ApplyInvoiceTaskRequest
     * @return ApplyInvoiceTaskResponse
     */
    public ApplyInvoiceTaskResponse applyInvoiceTask(ApplyInvoiceTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyInvoiceTaskHeaders headers = new ApplyInvoiceTaskHeaders();
        return this.applyInvoiceTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询出差审批单列表</p>
     * 
     * @param request ApplyListQueryRequest
     * @param headers ApplyListQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyListQueryResponse
     */
    public ApplyListQueryResponse applyListQueryWithOptions(ApplyListQueryRequest request, ApplyListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allApply)) {
            query.put("all_apply", request.allApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            query.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            query.put("gmt_modified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyShangLvApply)) {
            query.put("only_shang_lv_apply", request.onlyShangLvApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            query.put("sub_corp_id", request.subCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionNo)) {
            query.put("union_no", request.unionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/biz-trips"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyListQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询出差审批单列表</p>
     * 
     * @param request ApplyListQueryRequest
     * @return ApplyListQueryResponse
     */
    public ApplyListQueryResponse applyListQuery(ApplyListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyListQueryHeaders headers = new ApplyListQueryHeaders();
        return this.applyListQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新出差审批单</p>
     * 
     * @param tmpReq ApplyModifyRequest
     * @param headers ApplyModifyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyModifyResponse
     */
    public ApplyModifyResponse applyModifyWithOptions(ApplyModifyRequest tmpReq, ApplyModifyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyModifyShrinkRequest request = new ApplyModifyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.carRule)) {
            request.carRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.carRule, "car_rule", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalTravelerList)) {
            request.externalTravelerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalTravelerList, "external_traveler_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalTravelerStandard)) {
            request.externalTravelerStandardShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalTravelerStandard, "external_traveler_standard", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelShare)) {
            request.hotelShareShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelShare, "hotel_share", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itineraryList)) {
            request.itineraryListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itineraryList, "itinerary_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itinerarySetList)) {
            request.itinerarySetListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itinerarySetList, "itinerary_set_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerList)) {
            request.travelerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerList, "traveler_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerStandard)) {
            request.travelerStandardShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerStandard, "traveler_standard", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.budget)) {
            body.put("budget", request.budget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budgetMerge)) {
            body.put("budget_merge", request.budgetMerge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carRuleShrink)) {
            body.put("car_rule", request.carRuleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            body.put("corp_name", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            body.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departName)) {
            body.put("depart_name", request.departName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendField)) {
            body.put("extend_field", request.extendField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTravelerListShrink)) {
            body.put("external_traveler_list", request.externalTravelerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTravelerStandardShrink)) {
            body.put("external_traveler_standard", request.externalTravelerStandardShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flightBudget)) {
            body.put("flight_budget", request.flightBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelBudget)) {
            body.put("hotel_budget", request.hotelBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelShareShrink)) {
            body.put("hotel_share", request.hotelShareShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryListShrink)) {
            body.put("itinerary_list", request.itineraryListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryRule)) {
            body.put("itinerary_rule", request.itineraryRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itinerarySetListShrink)) {
            body.put("itinerary_set_list", request.itinerarySetListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitTraveler)) {
            body.put("limit_traveler", request.limitTraveler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDepartmentId)) {
            body.put("payment_department_id", request.paymentDepartmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDepartmentName)) {
            body.put("payment_department_name", request.paymentDepartmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            body.put("sub_corp_id", request.subCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            body.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartBusinessId)) {
            body.put("thirdpart_business_id", request.thirdpartBusinessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartDepartId)) {
            body.put("thirdpart_depart_id", request.thirdpartDepartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.togetherBookRule)) {
            body.put("together_book_rule", request.togetherBookRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainBudget)) {
            body.put("train_budget", request.trainBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerListShrink)) {
            body.put("traveler_list", request.travelerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerStandardShrink)) {
            body.put("traveler_standard", request.travelerStandardShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripCause)) {
            body.put("trip_cause", request.tripCause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripDay)) {
            body.put("trip_day", request.tripDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripTitle)) {
            body.put("trip_title", request.tripTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionNo)) {
            body.put("union_no", request.unionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("user_name", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleBudget)) {
            body.put("vehicle_budget", request.vehicleBudget);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyModify"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/biz-trip"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyModifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新出差审批单</p>
     * 
     * @param request ApplyModifyRequest
     * @return ApplyModifyResponse
     */
    public ApplyModifyResponse applyModify(ApplyModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyModifyHeaders headers = new ApplyModifyHeaders();
        return this.applyModifyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询出差审批单详情</p>
     * 
     * @param request ApplyQueryRequest
     * @param headers ApplyQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyQueryResponse
     */
    public ApplyQueryResponse applyQueryWithOptions(ApplyQueryRequest request, ApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyShowId)) {
            query.put("apply_show_id", request.applyShowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            query.put("sub_corp_id", request.subCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            query.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/biz-trip"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询出差审批单详情</p>
     * 
     * @param request ApplyQueryRequest
     * @return ApplyQueryResponse
     */
    public ApplyQueryResponse applyQuery(ApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyQueryHeaders headers = new ApplyQueryHeaders();
        return this.applyQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行审批任务</p>
     * 
     * @param request ApplyTripTaskExecuteRequest
     * @param headers ApplyTripTaskExecuteHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyTripTaskExecuteResponse
     */
    public ApplyTripTaskExecuteResponse applyTripTaskExecuteWithOptions(ApplyTripTaskExecuteRequest request, ApplyTripTaskExecuteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionFrom)) {
            body.put("action_from", request.actionFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAction)) {
            body.put("task_action", request.taskAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("task_id", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("user_name", request.userName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyTripTaskExecute"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/trip-task/action/execute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyTripTaskExecuteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>执行审批任务</p>
     * 
     * @param request ApplyTripTaskExecuteRequest
     * @return ApplyTripTaskExecuteResponse
     */
    public ApplyTripTaskExecuteResponse applyTripTaskExecute(ApplyTripTaskExecuteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyTripTaskExecuteHeaders headers = new ApplyTripTaskExecuteHeaders();
        return this.applyTripTaskExecuteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>搜索国内/国际（港澳台）城市基础行政区划数据</p>
     * 
     * @param request BaseCityInfoSearchRequest
     * @param headers BaseCityInfoSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BaseCityInfoSearchResponse
     */
    public BaseCityInfoSearchResponse baseCityInfoSearchWithOptions(BaseCityInfoSearchRequest request, BaseCityInfoSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripAccessToken)) {
            realHeaders.put("x-acs-btrip-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BaseCityInfoSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/city/v1/cities/action/search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BaseCityInfoSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>搜索国内/国际（港澳台）城市基础行政区划数据</p>
     * 
     * @param request BaseCityInfoSearchRequest
     * @return BaseCityInfoSearchResponse
     */
    public BaseCityInfoSearchResponse baseCityInfoSearch(BaseCityInfoSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BaseCityInfoSearchHeaders headers = new BaseCityInfoSearchHeaders();
        return this.baseCityInfoSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>商旅账单内容修改</p>
     * 
     * @param request BtripBillInfoAdjustRequest
     * @param headers BtripBillInfoAdjustHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BtripBillInfoAdjustResponse
     */
    public BtripBillInfoAdjustResponse btripBillInfoAdjustWithOptions(BtripBillInfoAdjustRequest request, BtripBillInfoAdjustHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.primaryId)) {
            body.put("primary_id", request.primaryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartCostCenterId)) {
            body.put("third_part_cost_center_id", request.thirdPartCostCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartDepartmentId)) {
            body.put("third_part_department_id", request.thirdPartDepartmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartInvoiceId)) {
            body.put("third_part_invoice_id", request.thirdPartInvoiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartProjectId)) {
            body.put("third_part_project_id", request.thirdPartProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BtripBillInfoAdjust"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bill/v1/info/action/adjust"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BtripBillInfoAdjustResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>商旅账单内容修改</p>
     * 
     * @param request BtripBillInfoAdjustRequest
     * @return BtripBillInfoAdjustResponse
     */
    public BtripBillInfoAdjustResponse btripBillInfoAdjust(BtripBillInfoAdjustRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BtripBillInfoAdjustHeaders headers = new BtripBillInfoAdjustHeaders();
        return this.btripBillInfoAdjustWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步市内用车审批单</p>
     * 
     * @param tmpReq CarApplyAddRequest
     * @param headers CarApplyAddHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CarApplyAddResponse
     */
    public CarApplyAddResponse carApplyAddWithOptions(CarApplyAddRequest tmpReq, CarApplyAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CarApplyAddShrinkRequest request = new CarApplyAddShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerStandard)) {
            request.travelerStandardShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerStandard, "traveler_standard", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cause)) {
            body.put("cause", request.cause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            body.put("city", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCodeSet)) {
            body.put("city_code_set", request.cityCodeSet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            body.put("date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finishedDate)) {
            body.put("finished_date", request.finishedDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCode)) {
            body.put("project_code", request.projectCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("project_name", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartApplyId)) {
            body.put("third_part_apply_id", request.thirdPartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartCostCenterId)) {
            body.put("third_part_cost_center_id", request.thirdPartCostCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartInvoiceId)) {
            body.put("third_part_invoice_id", request.thirdPartInvoiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timesTotal)) {
            body.put("times_total", request.timesTotal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timesType)) {
            body.put("times_type", request.timesType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timesUsed)) {
            body.put("times_used", request.timesUsed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerStandardShrink)) {
            body.put("traveler_standard", request.travelerStandardShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarApplyAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/car"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarApplyAddResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步市内用车审批单</p>
     * 
     * @param request CarApplyAddRequest
     * @return CarApplyAddResponse
     */
    public CarApplyAddResponse carApplyAdd(CarApplyAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarApplyAddHeaders headers = new CarApplyAddHeaders();
        return this.carApplyAddWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新市内用车审批单</p>
     * 
     * @param request CarApplyModifyRequest
     * @param headers CarApplyModifyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CarApplyModifyResponse
     */
    public CarApplyModifyResponse carApplyModifyWithOptions(CarApplyModifyRequest request, CarApplyModifyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operateTime)) {
            body.put("operate_time", request.operateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartApplyId)) {
            body.put("third_part_apply_id", request.thirdPartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarApplyModify"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/car"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarApplyModifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新市内用车审批单</p>
     * 
     * @param request CarApplyModifyRequest
     * @return CarApplyModifyResponse
     */
    public CarApplyModifyResponse carApplyModify(CarApplyModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarApplyModifyHeaders headers = new CarApplyModifyHeaders();
        return this.carApplyModifyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询市内用车审批单</p>
     * 
     * @param request CarApplyQueryRequest
     * @param headers CarApplyQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CarApplyQueryResponse
     */
    public CarApplyQueryResponse carApplyQueryWithOptions(CarApplyQueryRequest request, CarApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createdEndAt)) {
            query.put("created_end_at", request.createdEndAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdStartAt)) {
            query.put("created_start_at", request.createdStartAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartApplyId)) {
            query.put("third_part_apply_id", request.thirdPartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/car"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarApplyQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询市内用车审批单</p>
     * 
     * @param request CarApplyQueryRequest
     * @return CarApplyQueryResponse
     */
    public CarApplyQueryResponse carApplyQuery(CarApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarApplyQueryHeaders headers = new CarApplyQueryHeaders();
        return this.carApplyQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用车记账数据</p>
     * 
     * @param request CarBillSettlementQueryRequest
     * @param headers CarBillSettlementQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CarBillSettlementQueryResponse
     */
    public CarBillSettlementQueryResponse carBillSettlementQueryWithOptions(CarBillSettlementQueryRequest request, CarBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/car/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarBillSettlementQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用车记账数据</p>
     * 
     * @param request CarBillSettlementQueryRequest
     * @return CarBillSettlementQueryResponse
     */
    public CarBillSettlementQueryResponse carBillSettlementQuery(CarBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarBillSettlementQueryHeaders headers = new CarBillSettlementQueryHeaders();
        return this.carBillSettlementQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用车订单列表</p>
     * 
     * @param request CarOrderListQueryRequest
     * @param headers CarOrderListQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CarOrderListQueryResponse
     */
    public CarOrderListQueryResponse carOrderListQueryWithOptions(CarOrderListQueryRequest request, CarOrderListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allApply)) {
            query.put("all_apply", request.allApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            query.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            query.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            query.put("update_end_time", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStartTime)) {
            query.put("update_start_time", request.updateStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarOrderListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/car/v1/order-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarOrderListQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用车订单列表</p>
     * 
     * @param request CarOrderListQueryRequest
     * @return CarOrderListQueryResponse
     */
    public CarOrderListQueryResponse carOrderListQuery(CarOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarOrderListQueryHeaders headers = new CarOrderListQueryHeaders();
        return this.carOrderListQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用车订单查询</p>
     * 
     * @param request CarOrderQueryRequest
     * @param headers CarOrderQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CarOrderQueryResponse
     */
    public CarOrderQueryResponse carOrderQueryWithOptions(CarOrderQueryRequest request, CarOrderQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subOrderId)) {
            query.put("sub_order_id", request.subOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarOrderQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/car/v1/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarOrderQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>用车订单查询</p>
     * 
     * @param request CarOrderQueryRequest
     * @return CarOrderQueryResponse
     */
    public CarOrderQueryResponse carOrderQuery(CarOrderQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarOrderQueryHeaders headers = new CarOrderQueryHeaders();
        return this.carOrderQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询企业用车场景</p>
     * 
     * @param headers CarSceneQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CarSceneQueryResponse
     */
    public CarSceneQueryResponse carSceneQueryWithOptions(CarSceneQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarSceneQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/car/v1/scenes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarSceneQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询企业用车场景</p>
     * @return CarSceneQueryResponse
     */
    public CarSceneQueryResponse carSceneQuery() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarSceneQueryHeaders headers = new CarSceneQueryHeaders();
        return this.carSceneQueryWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>渠道商创建企业</p>
     * 
     * @param request ChannelCorpCreateRequest
     * @param headers ChannelCorpCreateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChannelCorpCreateResponse
     */
    public ChannelCorpCreateResponse channelCorpCreateWithOptions(ChannelCorpCreateRequest request, ChannelCorpCreateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.administratorName)) {
            body.put("administrator_name", request.administratorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.administratorPhone)) {
            body.put("administrator_phone", request.administratorPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            body.put("city", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            body.put("corp_name", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            body.put("province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdCorpId)) {
            body.put("third_corp_id", request.thirdCorpId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChannelCorpCreate"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/corp/v1/channelCorps"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChannelCorpCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>渠道商创建企业</p>
     * 
     * @param request ChannelCorpCreateRequest
     * @return ChannelCorpCreateResponse
     */
    public ChannelCorpCreateResponse channelCorpCreate(ChannelCorpCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChannelCorpCreateHeaders headers = new ChannelCorpCreateHeaders();
        return this.channelCorpCreateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询行政区划（市，区）基础数据</p>
     * 
     * @param request CitySearchRequest
     * @param headers CitySearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CitySearchResponse
     */
    public CitySearchResponse citySearchWithOptions(CitySearchRequest request, CitySearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CitySearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/city/v1/city"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CitySearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询行政区划（市，区）基础数据</p>
     * 
     * @param request CitySearchRequest
     * @return CitySearchResponse
     */
    public CitySearchResponse citySearch(CitySearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CitySearchHeaders headers = new CitySearchHeaders();
        return this.citySearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询退改审批信息</p>
     * 
     * @param request CommonApplyQueryRequest
     * @param headers CommonApplyQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommonApplyQueryResponse
     */
    public CommonApplyQueryResponse commonApplyQueryWithOptions(CommonApplyQueryRequest request, CommonApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCategory)) {
            query.put("biz_category", request.bizCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInstanceId)) {
            query.put("business_instance_id", request.businessInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommonApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/common"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommonApplyQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询退改审批信息</p>
     * 
     * @param request CommonApplyQueryRequest
     * @return CommonApplyQueryResponse
     */
    public CommonApplyQueryResponse commonApplyQuery(CommonApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CommonApplyQueryHeaders headers = new CommonApplyQueryHeaders();
        return this.commonApplyQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>退改审批结果同步</p>
     * 
     * @param request CommonApplySyncRequest
     * @param headers CommonApplySyncHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommonApplySyncResponse
     */
    public CommonApplySyncResponse commonApplySyncWithOptions(CommonApplySyncRequest request, CommonApplySyncHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCategory)) {
            query.put("biz_category", request.bizCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartyFlowId)) {
            query.put("thirdparty_flow_id", request.thirdpartyFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommonApplySync"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/syn-common"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommonApplySyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>退改审批结果同步</p>
     * 
     * @param request CommonApplySyncRequest
     * @return CommonApplySyncResponse
     */
    public CommonApplySyncResponse commonApplySync(CommonApplySyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CommonApplySyncHeaders headers = new CommonApplySyncHeaders();
        return this.commonApplySyncWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务商机票记账数据</p>
     * 
     * @param request CooperatorFlightBillSettlementQueryRequest
     * @param headers CooperatorFlightBillSettlementQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CooperatorFlightBillSettlementQueryResponse
     */
    public CooperatorFlightBillSettlementQueryResponse cooperatorFlightBillSettlementQueryWithOptions(CooperatorFlightBillSettlementQueryRequest request, CooperatorFlightBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cooperatorId)) {
            query.put("cooperator_id", request.cooperatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CooperatorFlightBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cooperator-flight/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CooperatorFlightBillSettlementQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务商机票记账数据</p>
     * 
     * @param request CooperatorFlightBillSettlementQueryRequest
     * @return CooperatorFlightBillSettlementQueryResponse
     */
    public CooperatorFlightBillSettlementQueryResponse cooperatorFlightBillSettlementQuery(CooperatorFlightBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CooperatorFlightBillSettlementQueryHeaders headers = new CooperatorFlightBillSettlementQueryHeaders();
        return this.cooperatorFlightBillSettlementQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务商酒店记账数据</p>
     * 
     * @param request CooperatorHotelBillSettlementQueryRequest
     * @param headers CooperatorHotelBillSettlementQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CooperatorHotelBillSettlementQueryResponse
     */
    public CooperatorHotelBillSettlementQueryResponse cooperatorHotelBillSettlementQueryWithOptions(CooperatorHotelBillSettlementQueryRequest request, CooperatorHotelBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cooperatorId)) {
            query.put("cooperator_id", request.cooperatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CooperatorHotelBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cooperator-hotel/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CooperatorHotelBillSettlementQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务商酒店记账数据</p>
     * 
     * @param request CooperatorHotelBillSettlementQueryRequest
     * @return CooperatorHotelBillSettlementQueryResponse
     */
    public CooperatorHotelBillSettlementQueryResponse cooperatorHotelBillSettlementQuery(CooperatorHotelBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CooperatorHotelBillSettlementQueryHeaders headers = new CooperatorHotelBillSettlementQueryHeaders();
        return this.cooperatorHotelBillSettlementQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取关联可调用企业接口</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CorpAuthLinkInfoQueryResponse
     */
    public CorpAuthLinkInfoQueryResponse corpAuthLinkInfoQueryWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CorpAuthLinkInfoQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/corp-authority-link/v1/info"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CorpAuthLinkInfoQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取关联可调用企业接口</p>
     * @return CorpAuthLinkInfoQueryResponse
     */
    public CorpAuthLinkInfoQueryResponse corpAuthLinkInfoQuery() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.corpAuthLinkInfoQueryWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>换取CorpToken接口</p>
     * 
     * @param request CorpTokenRequest
     * @param headers CorpTokenHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CorpTokenResponse
     */
    public CorpTokenResponse corpTokenWithOptions(CorpTokenRequest request, CorpTokenHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appSecret)) {
            query.put("app_secret", request.appSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("corp_id", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripAccessToken)) {
            realHeaders.put("x-acs-btrip-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CorpToken"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/btrip-open-auth/v1/corp-token/action/take"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CorpTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>换取CorpToken接口</p>
     * 
     * @param request CorpTokenRequest
     * @return CorpTokenResponse
     */
    public CorpTokenResponse corpToken(CorpTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CorpTokenHeaders headers = new CorpTokenHeaders();
        return this.corpTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除成本中心</p>
     * 
     * @param request CostCenterDeleteRequest
     * @param headers CostCenterDeleteHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CostCenterDeleteResponse
     */
    public CostCenterDeleteResponse costCenterDeleteWithOptions(CostCenterDeleteRequest request, CostCenterDeleteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            query.put("thirdpart_id", request.thirdpartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CostCenterDelete"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/delete-costcenter"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CostCenterDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除成本中心</p>
     * 
     * @param request CostCenterDeleteRequest
     * @return CostCenterDeleteResponse
     */
    public CostCenterDeleteResponse costCenterDelete(CostCenterDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterDeleteHeaders headers = new CostCenterDeleteHeaders();
        return this.costCenterDeleteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改成本中心</p>
     * 
     * @param request CostCenterModifyRequest
     * @param headers CostCenterModifyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CostCenterModifyResponse
     */
    public CostCenterModifyResponse costCenterModifyWithOptions(CostCenterModifyRequest request, CostCenterModifyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alipayNo)) {
            body.put("alipay_no", request.alipayNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disable)) {
            body.put("disable", request.disable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            body.put("number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            body.put("thirdpart_id", request.thirdpartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CostCenterModify"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/modify-costcenter"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CostCenterModifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改成本中心</p>
     * 
     * @param request CostCenterModifyRequest
     * @return CostCenterModifyResponse
     */
    public CostCenterModifyResponse costCenterModify(CostCenterModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterModifyHeaders headers = new CostCenterModifyHeaders();
        return this.costCenterModifyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看成本中心</p>
     * 
     * @param request CostCenterQueryRequest
     * @param headers CostCenterQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CostCenterQueryResponse
     */
    public CostCenterQueryResponse costCenterQueryWithOptions(CostCenterQueryRequest request, CostCenterQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disable)) {
            query.put("disable", request.disable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needOrgEntity)) {
            query.put("need_org_entity", request.needOrgEntity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            query.put("thirdpart_id", request.thirdpartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CostCenterQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/costcenter"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CostCenterQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看成本中心</p>
     * 
     * @param request CostCenterQueryRequest
     * @return CostCenterQueryResponse
     */
    public CostCenterQueryResponse costCenterQuery(CostCenterQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterQueryHeaders headers = new CostCenterQueryHeaders();
        return this.costCenterQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存成本中心</p>
     * 
     * @param request CostCenterSaveRequest
     * @param headers CostCenterSaveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CostCenterSaveResponse
     */
    public CostCenterSaveResponse costCenterSaveWithOptions(CostCenterSaveRequest request, CostCenterSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alipayNo)) {
            body.put("alipay_no", request.alipayNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disable)) {
            body.put("disable", request.disable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            body.put("number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            body.put("thirdpart_id", request.thirdpartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CostCenterSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/save-costcenter"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CostCenterSaveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存成本中心</p>
     * 
     * @param request CostCenterSaveRequest
     * @return CostCenterSaveResponse
     */
    public CostCenterSaveResponse costCenterSave(CostCenterSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterSaveHeaders headers = new CostCenterSaveHeaders();
        return this.costCenterSaveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建企业自定义角色</p>
     * 
     * @param request CreateCustomRoleRequest
     * @param headers CreateCustomRoleHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomRoleResponse
     */
    public CreateCustomRoleResponse createCustomRoleWithOptions(CreateCustomRoleRequest request, CreateCustomRoleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            body.put("role_id", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("role_name", request.roleName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomRole"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/role/v1/customRoles/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建企业自定义角色</p>
     * 
     * @param request CreateCustomRoleRequest
     * @return CreateCustomRoleResponse
     */
    public CreateCustomRoleResponse createCustomRole(CreateCustomRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateCustomRoleHeaders headers = new CreateCustomRoleHeaders();
        return this.createCustomRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建子企业</p>
     * 
     * @param request CreateSubCorpRequest
     * @param headers CreateSubCorpHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSubCorpResponse
     */
    public CreateSubCorpResponse createSubCorpWithOptions(CreateSubCorpRequest request, CreateSubCorpHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outerCorpId)) {
            body.put("outer_corp_id", request.outerCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerCorpName)) {
            body.put("outer_corp_name", request.outerCorpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubCorp"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sub_corps/v1/corps"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubCorpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建子企业</p>
     * 
     * @param request CreateSubCorpRequest
     * @return CreateSubCorpResponse
     */
    public CreateSubCorpResponse createSubCorp(CreateSubCorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSubCorpHeaders headers = new CreateSubCorpHeaders();
        return this.createSubCorpWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除企业自定义角色</p>
     * 
     * @param request DeleteCustomRoleRequest
     * @param headers DeleteCustomRoleHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomRoleResponse
     */
    public DeleteCustomRoleResponse deleteCustomRoleWithOptions(DeleteCustomRoleRequest request, DeleteCustomRoleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            body.put("role_id", request.roleId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomRole"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/role/v1/customRoles/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除企业自定义角色</p>
     * 
     * @param request DeleteCustomRoleRequest
     * @return DeleteCustomRoleResponse
     */
    public DeleteCustomRoleResponse deleteCustomRole(DeleteCustomRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteCustomRoleHeaders headers = new DeleteCustomRoleHeaders();
        return this.deleteCustomRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除企业部门</p>
     * 
     * @param request DeleteDepartmentRequest
     * @param headers DeleteDepartmentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDepartmentResponse
     */
    public DeleteDepartmentResponse deleteDepartmentWithOptions(DeleteDepartmentRequest request, DeleteDepartmentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outDeptId)) {
            body.put("out_dept_id", request.outDeptId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDepartment"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/department/v2/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDepartmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除企业部门</p>
     * 
     * @param request DeleteDepartmentRequest
     * @return DeleteDepartmentResponse
     */
    public DeleteDepartmentResponse deleteDepartment(DeleteDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteDepartmentHeaders headers = new DeleteDepartmentHeaders();
        return this.deleteDepartmentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除企业自定义角色下人员</p>
     * 
     * @param tmpReq DeleteEmployeesFromCustomRoleRequest
     * @param headers DeleteEmployeesFromCustomRoleHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEmployeesFromCustomRoleResponse
     */
    public DeleteEmployeesFromCustomRoleResponse deleteEmployeesFromCustomRoleWithOptions(DeleteEmployeesFromCustomRoleRequest tmpReq, DeleteEmployeesFromCustomRoleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteEmployeesFromCustomRoleShrinkRequest request = new DeleteEmployeesFromCustomRoleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIdList)) {
            request.userIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIdList, "user_id_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            body.put("role_id", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdListShrink)) {
            body.put("user_id_list", request.userIdListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEmployeesFromCustomRole"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/role/v1/customRoleEmployees/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEmployeesFromCustomRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除企业自定义角色下人员</p>
     * 
     * @param request DeleteEmployeesFromCustomRoleRequest
     * @return DeleteEmployeesFromCustomRoleResponse
     */
    public DeleteEmployeesFromCustomRoleResponse deleteEmployeesFromCustomRole(DeleteEmployeesFromCustomRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteEmployeesFromCustomRoleHeaders headers = new DeleteEmployeesFromCustomRoleHeaders();
        return this.deleteEmployeesFromCustomRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除发票抬头适用人员</p>
     * 
     * @param tmpReq DeleteInvoiceEntityRequest
     * @param headers DeleteInvoiceEntityHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInvoiceEntityResponse
     */
    public DeleteInvoiceEntityResponse deleteInvoiceEntityWithOptions(DeleteInvoiceEntityRequest tmpReq, DeleteInvoiceEntityHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteInvoiceEntityShrinkRequest request = new DeleteInvoiceEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entities)) {
            request.entitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entities, "entities", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delAll)) {
            query.put("del_all", request.delAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entitiesShrink)) {
            query.put("entities", request.entitiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            query.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInvoiceEntity"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/entities"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInvoiceEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除发票抬头适用人员</p>
     * 
     * @param request DeleteInvoiceEntityRequest
     * @return DeleteInvoiceEntityResponse
     */
    public DeleteInvoiceEntityResponse deleteInvoiceEntity(DeleteInvoiceEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteInvoiceEntityHeaders headers = new DeleteInvoiceEntityHeaders();
        return this.deleteInvoiceEntityWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步外部平台部门信息至商旅内部</p>
     * 
     * @param tmpReq DepartmentSaveRequest
     * @param headers DepartmentSaveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DepartmentSaveResponse
     */
    public DepartmentSaveResponse departmentSaveWithOptions(DepartmentSaveRequest tmpReq, DepartmentSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DepartmentSaveShrinkRequest request = new DepartmentSaveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.departList)) {
            request.departListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.departList, "depart_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departListShrink)) {
            body.put("depart_list", request.departListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DepartmentSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/department/v1/department"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DepartmentSaveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步外部平台部门信息至商旅内部</p>
     * 
     * @param request DepartmentSaveRequest
     * @return DepartmentSaveResponse
     */
    public DepartmentSaveResponse departmentSave(DepartmentSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DepartmentSaveHeaders headers = new DepartmentSaveHeaders();
        return this.departmentSaveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>增加成本中心人员信息</p>
     * 
     * @param tmpReq EntityAddRequest
     * @param headers EntityAddHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EntityAddResponse
     */
    public EntityAddResponse entityAddWithOptions(EntityAddRequest tmpReq, EntityAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EntityAddShrinkRequest request = new EntityAddShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityDOList)) {
            request.entityDOListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityDOList, "entity_d_o_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityDOListShrink)) {
            body.put("entity_d_o_list", request.entityDOListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            body.put("thirdpart_id", request.thirdpartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EntityAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/add-entity"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EntityAddResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>增加成本中心人员信息</p>
     * 
     * @param request EntityAddRequest
     * @return EntityAddResponse
     */
    public EntityAddResponse entityAdd(EntityAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EntityAddHeaders headers = new EntityAddHeaders();
        return this.entityAddWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除成本中心人员信息</p>
     * 
     * @param tmpReq EntityDeleteRequest
     * @param headers EntityDeleteHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EntityDeleteResponse
     */
    public EntityDeleteResponse entityDeleteWithOptions(EntityDeleteRequest tmpReq, EntityDeleteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EntityDeleteShrinkRequest request = new EntityDeleteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityDOList)) {
            request.entityDOListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityDOList, "entity_d_o_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delAll)) {
            query.put("del_all", request.delAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            query.put("thirdpart_id", request.thirdpartId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityDOListShrink)) {
            body.put("entity_d_o_list", request.entityDOListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EntityDelete"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/entity/action/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EntityDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除成本中心人员信息</p>
     * 
     * @param request EntityDeleteRequest
     * @return EntityDeleteResponse
     */
    public EntityDeleteResponse entityDelete(EntityDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EntityDeleteHeaders headers = new EntityDeleteHeaders();
        return this.entityDeleteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置成本中心人员信息</p>
     * 
     * @param tmpReq EntitySetRequest
     * @param headers EntitySetHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EntitySetResponse
     */
    public EntitySetResponse entitySetWithOptions(EntitySetRequest tmpReq, EntitySetHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EntitySetShrinkRequest request = new EntitySetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityDOList)) {
            request.entityDOListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityDOList, "entity_d_o_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityDOListShrink)) {
            body.put("entity_d_o_list", request.entityDOListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            body.put("thirdpart_id", request.thirdpartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EntitySet"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/set-entity"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EntitySetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置成本中心人员信息</p>
     * 
     * @param request EntitySetRequest
     * @return EntitySetResponse
     */
    public EntitySetResponse entitySet(EntitySetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EntitySetHeaders headers = new EntitySetHeaders();
        return this.entitySetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预估价格查询</p>
     * 
     * @param request EstimatedPriceQueryRequest
     * @param headers EstimatedPriceQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EstimatedPriceQueryResponse
     */
    public EstimatedPriceQueryResponse estimatedPriceQueryWithOptions(EstimatedPriceQueryRequest request, EstimatedPriceQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrCity)) {
            query.put("arr_city", request.arrCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCity)) {
            query.put("dep_city", request.depCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryId)) {
            query.put("itinerary_id", request.itineraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            query.put("sub_corp_id", request.subCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EstimatedPriceQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/estimated-price"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EstimatedPriceQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预估价格查询</p>
     * 
     * @param request EstimatedPriceQueryRequest
     * @return EstimatedPriceQueryResponse
     */
    public EstimatedPriceQueryResponse estimatedPriceQuery(EstimatedPriceQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EstimatedPriceQueryHeaders headers = new EstimatedPriceQueryHeaders();
        return this.estimatedPriceQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>超标审批结果同步</p>
     * 
     * @param request ExceedApplySyncRequest
     * @param headers ExceedApplySyncHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExceedApplySyncResponse
     */
    public ExceedApplySyncResponse exceedApplySyncWithOptions(ExceedApplySyncRequest request, ExceedApplySyncHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCategory)) {
            query.put("biz_category", request.bizCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartyFlowId)) {
            query.put("thirdparty_flow_id", request.thirdpartyFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExceedApplySync"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/syn-exceed"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExceedApplySyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>超标审批结果同步</p>
     * 
     * @param request ExceedApplySyncRequest
     * @return ExceedApplySyncResponse
     */
    public ExceedApplySyncResponse exceedApplySync(ExceedApplySyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExceedApplySyncHeaders headers = new ExceedApplySyncHeaders();
        return this.exceedApplySyncWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加外部出行人与证件信息</p>
     * 
     * @param tmpReq ExternalUserAddRequest
     * @param headers ExternalUserAddHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExternalUserAddResponse
     */
    public ExternalUserAddResponse externalUserAddWithOptions(ExternalUserAddRequest tmpReq, ExternalUserAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExternalUserAddShrinkRequest request = new ExternalUserAddShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.certRequestList)) {
            request.certRequestListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.certRequestList, "cert_request_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.birthday)) {
            body.put("birthday", request.birthday);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certRequestListShrink)) {
            body.put("cert_request_list", request.certRequestListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalUserId)) {
            body.put("external_user_id", request.externalUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realName)) {
            body.put("real_name", request.realName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realNameEn)) {
            body.put("real_name_en", request.realNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            body.put("user_type", request.userType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExternalUserAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/v1/externalUsers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExternalUserAddResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加外部出行人与证件信息</p>
     * 
     * @param request ExternalUserAddRequest
     * @return ExternalUserAddResponse
     */
    public ExternalUserAddResponse externalUserAdd(ExternalUserAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExternalUserAddHeaders headers = new ExternalUserAddHeaders();
        return this.externalUserAddWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除外部出行人</p>
     * 
     * @param headers ExternalUserDeleteHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExternalUserDeleteResponse
     */
    public ExternalUserDeleteResponse externalUserDeleteWithOptions(String externalUserId, ExternalUserDeleteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExternalUserDelete"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/v1/externalUsers/" + com.aliyun.openapiutil.Client.getEncodeParam(externalUserId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExternalUserDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除外部出行人</p>
     * @return ExternalUserDeleteResponse
     */
    public ExternalUserDeleteResponse externalUserDelete(String externalUserId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExternalUserDeleteHeaders headers = new ExternalUserDeleteHeaders();
        return this.externalUserDeleteWithOptions(externalUserId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改外部出行人与证件信息</p>
     * 
     * @param tmpReq ExternalUserUpdateRequest
     * @param headers ExternalUserUpdateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExternalUserUpdateResponse
     */
    public ExternalUserUpdateResponse externalUserUpdateWithOptions(String externalUserId, ExternalUserUpdateRequest tmpReq, ExternalUserUpdateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExternalUserUpdateShrinkRequest request = new ExternalUserUpdateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.certRequestList)) {
            request.certRequestListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.certRequestList, "cert_request_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.birthday)) {
            body.put("birthday", request.birthday);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certRequestListShrink)) {
            body.put("cert_request_list", request.certRequestListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realName)) {
            body.put("real_name", request.realName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realNameEn)) {
            body.put("real_name_en", request.realNameEn);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExternalUserUpdate"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/v1/externalUsers/" + com.aliyun.openapiutil.Client.getEncodeParam(externalUserId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExternalUserUpdateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改外部出行人与证件信息</p>
     * 
     * @param request ExternalUserUpdateRequest
     * @return ExternalUserUpdateResponse
     */
    public ExternalUserUpdateResponse externalUserUpdate(String externalUserId, ExternalUserUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExternalUserUpdateHeaders headers = new ExternalUserUpdateHeaders();
        return this.externalUserUpdateWithOptions(externalUserId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询机票记账数据</p>
     * 
     * @param request FlightBillSettlementQueryRequest
     * @param headers FlightBillSettlementQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightBillSettlementQueryResponse
     */
    public FlightBillSettlementQueryResponse flightBillSettlementQueryWithOptions(FlightBillSettlementQueryRequest request, FlightBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/flight/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightBillSettlementQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询机票记账数据</p>
     * 
     * @param request FlightBillSettlementQueryRequest
     * @return FlightBillSettlementQueryResponse
     */
    public FlightBillSettlementQueryResponse flightBillSettlementQuery(FlightBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightBillSettlementQueryHeaders headers = new FlightBillSettlementQueryHeaders();
        return this.flightBillSettlementQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>航班订单取消</p>
     * 
     * @param request FlightCancelOrderRequest
     * @param headers FlightCancelOrderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightCancelOrderResponse
     */
    public FlightCancelOrderResponse flightCancelOrderWithOptions(FlightCancelOrderRequest request, FlightCancelOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightCancelOrder"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/order/action/cancel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightCancelOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>航班订单取消</p>
     * 
     * @param request FlightCancelOrderRequest
     * @return FlightCancelOrderResponse
     */
    public FlightCancelOrderResponse flightCancelOrder(FlightCancelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightCancelOrderHeaders headers = new FlightCancelOrderHeaders();
        return this.flightCancelOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票订单取消</p>
     * 
     * @param request FlightCancelOrderV2Request
     * @param headers FlightCancelOrderV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightCancelOrderV2Response
     */
    public FlightCancelOrderV2Response flightCancelOrderV2WithOptions(FlightCancelOrderV2Request request, FlightCancelOrderV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightCancelOrderV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/order/action/cancel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightCancelOrderV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票订单取消</p>
     * 
     * @param request FlightCancelOrderV2Request
     * @return FlightCancelOrderV2Response
     */
    public FlightCancelOrderV2Response flightCancelOrderV2(FlightCancelOrderV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightCancelOrderV2Headers headers = new FlightCancelOrderV2Headers();
        return this.flightCancelOrderV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>航班订单创建</p>
     * 
     * @param tmpReq FlightCreateOrderRequest
     * @param headers FlightCreateOrderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightCreateOrderResponse
     */
    public FlightCreateOrderResponse flightCreateOrderWithOptions(FlightCreateOrderRequest tmpReq, FlightCreateOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightCreateOrderShrinkRequest request = new FlightCreateOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contactInfo)) {
            request.contactInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contactInfo, "contact_info", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderAttr)) {
            request.orderAttrShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderAttr, "order_attr", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerInfoList)) {
            request.travelerInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerInfoList, "traveler_info_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrAirportCode)) {
            body.put("arr_airport_code", request.arrAirportCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityCode)) {
            body.put("arr_city_code", request.arrCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("auto_pay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            body.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerUniqueKey)) {
            body.put("buyer_unique_key", request.buyerUniqueKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactInfoShrink)) {
            body.put("contact_info", request.contactInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depAirportCode)) {
            body.put("dep_airport_code", request.depAirportCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityCode)) {
            body.put("dep_city_code", request.depCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            body.put("dep_date", request.depDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderAttrShrink)) {
            body.put("order_attr", request.orderAttrShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderParams)) {
            body.put("order_params", request.orderParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaItemId)) {
            body.put("ota_item_id", request.otaItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.price)) {
            body.put("price", request.price);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiptAddress)) {
            body.put("receipt_address", request.receiptAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiptTarget)) {
            body.put("receipt_target", request.receiptTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiptTitle)) {
            body.put("receipt_title", request.receiptTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerInfoListShrink)) {
            body.put("traveler_info_list", request.travelerInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripType)) {
            body.put("trip_type", request.tripType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightCreateOrder"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/order/action/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightCreateOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>航班订单创建</p>
     * 
     * @param request FlightCreateOrderRequest
     * @return FlightCreateOrderResponse
     */
    public FlightCreateOrderResponse flightCreateOrder(FlightCreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightCreateOrderHeaders headers = new FlightCreateOrderHeaders();
        return this.flightCreateOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票订单创建</p>
     * 
     * @param tmpReq FlightCreateOrderV2Request
     * @param headers FlightCreateOrderV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightCreateOrderV2Response
     */
    public FlightCreateOrderV2Response flightCreateOrderV2WithOptions(FlightCreateOrderV2Request tmpReq, FlightCreateOrderV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightCreateOrderV2ShrinkRequest request = new FlightCreateOrderV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contactInfo)) {
            request.contactInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contactInfo, "contact_info", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelers)) {
            request.travelersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelers, "travelers", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asyncCreateOrderKey)) {
            body.put("async_create_order_key", request.asyncCreateOrderKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asyncCreateOrderMode)) {
            body.put("async_create_order_mode", request.asyncCreateOrderMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            body.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactInfoShrink)) {
            body.put("contact_info", request.contactInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            body.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaItemId)) {
            body.put("ota_item_id", request.otaItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalPriceCent)) {
            body.put("total_price_cent", request.totalPriceCent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelersShrink)) {
            body.put("travelers", request.travelersShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightCreateOrderV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/order/action/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightCreateOrderV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票订单创建</p>
     * 
     * @param request FlightCreateOrderV2Request
     * @return FlightCreateOrderV2Response
     */
    public FlightCreateOrderV2Response flightCreateOrderV2(FlightCreateOrderV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightCreateOrderV2Headers headers = new FlightCreateOrderV2Headers();
        return this.flightCreateOrderV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询飞机超标审批详情</p>
     * 
     * @param request FlightExceedApplyQueryRequest
     * @param headers FlightExceedApplyQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightExceedApplyQueryResponse
     */
    public FlightExceedApplyQueryResponse flightExceedApplyQueryWithOptions(FlightExceedApplyQueryRequest request, FlightExceedApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInstanceId)) {
            query.put("business_instance_id", request.businessInstanceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightExceedApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/flight-exceed"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightExceedApplyQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询飞机超标审批详情</p>
     * 
     * @param request FlightExceedApplyQueryRequest
     * @return FlightExceedApplyQueryResponse
     */
    public FlightExceedApplyQueryResponse flightExceedApplyQuery(FlightExceedApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightExceedApplyQueryHeaders headers = new FlightExceedApplyQueryHeaders();
        return this.flightExceedApplyQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询机票行程单扫描件</p>
     * 
     * @param request FlightItineraryScanQueryRequest
     * @param headers FlightItineraryScanQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightItineraryScanQueryResponse
     */
    public FlightItineraryScanQueryResponse flightItineraryScanQueryWithOptions(FlightItineraryScanQueryRequest request, FlightItineraryScanQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            query.put("bill_date", request.billDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            query.put("bill_id", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceSubTaskId)) {
            query.put("invoice_sub_task_id", request.invoiceSubTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryNum)) {
            query.put("itinerary_num", request.itineraryNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketNo)) {
            query.put("ticket_no", request.ticketNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightItineraryScanQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scan/v1/flight-itinerary"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightItineraryScanQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询机票行程单扫描件</p>
     * 
     * @param request FlightItineraryScanQueryRequest
     * @return FlightItineraryScanQueryResponse
     */
    public FlightItineraryScanQueryResponse flightItineraryScanQuery(FlightItineraryScanQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightItineraryScanQueryHeaders headers = new FlightItineraryScanQueryHeaders();
        return this.flightItineraryScanQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>航班列表搜索</p>
     * 
     * @param request FlightListingSearchRequest
     * @param headers FlightListingSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightListingSearchResponse
     */
    public FlightListingSearchResponse flightListingSearchWithOptions(FlightListingSearchRequest request, FlightListingSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airlineCode)) {
            query.put("airline_code", request.airlineCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityCode)) {
            query.put("arr_city_code", request.arrCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinClass)) {
            query.put("cabin_class", request.cabinClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityCode)) {
            query.put("dep_city_code", request.depCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            query.put("dep_date", request.depDate);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightListingSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/flight/action/listing-search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightListingSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>航班列表搜索</p>
     * 
     * @param request FlightListingSearchRequest
     * @return FlightListingSearchResponse
     */
    public FlightListingSearchResponse flightListingSearch(FlightListingSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightListingSearchHeaders headers = new FlightListingSearchHeaders();
        return this.flightListingSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>航班列表搜索</p>
     * 
     * @param tmpReq FlightListingSearchV2Request
     * @param headers FlightListingSearchV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightListingSearchV2Response
     */
    public FlightListingSearchV2Response flightListingSearchV2WithOptions(FlightListingSearchV2Request tmpReq, FlightListingSearchV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightListingSearchV2ShrinkRequest request = new FlightListingSearchV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cabinTypeList)) {
            request.cabinTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cabinTypeList, "cabin_type_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchJourneys)) {
            request.searchJourneysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchJourneys, "search_journeys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airlineCode)) {
            query.put("airline_code", request.airlineCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinTypeListShrink)) {
            query.put("cabin_type_list", request.cabinTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directOnly)) {
            query.put("direct_only", request.directOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needMultiClassPrice)) {
            query.put("need_multi_class_price", request.needMultiClassPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needQueryServiceFee)) {
            query.put("need_query_service_fee", request.needQueryServiceFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needShareFlight)) {
            query.put("need_share_flight", request.needShareFlight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needYCBestPrice)) {
            query.put("need_y_c_best_price", request.needYCBestPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchJourneysShrink)) {
            query.put("search_journeys", request.searchJourneysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("search_mode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripType)) {
            query.put("trip_type", request.tripType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightListingSearchV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/flight/action/listing-search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightListingSearchV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>航班列表搜索</p>
     * 
     * @param request FlightListingSearchV2Request
     * @return FlightListingSearchV2Response
     */
    public FlightListingSearchV2Response flightListingSearchV2(FlightListingSearchV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightListingSearchV2Headers headers = new FlightListingSearchV2Headers();
        return this.flightListingSearchV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签申请</p>
     * 
     * @param tmpReq FlightModifyApplyV2Request
     * @param headers FlightModifyApplyV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightModifyApplyV2Response
     */
    public FlightModifyApplyV2Response flightModifyApplyV2WithOptions(FlightModifyApplyV2Request tmpReq, FlightModifyApplyV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightModifyApplyV2ShrinkRequest request = new FlightModifyApplyV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerSegmentRelations)) {
            request.passengerSegmentRelationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerSegmentRelations, "passenger_segment_relations", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cacheKey)) {
            body.put("cache_key", request.cacheKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactPhone)) {
            body.put("contact_phone", request.contactPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            body.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("item_id", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outSubOrderId)) {
            body.put("out_sub_order_id", request.outSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerSegmentRelationsShrink)) {
            body.put("passenger_segment_relations", request.passengerSegmentRelationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("session_id", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voluntary)) {
            body.put("voluntary", request.voluntary);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightModifyApplyV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/modify/action/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightModifyApplyV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签申请</p>
     * 
     * @param request FlightModifyApplyV2Request
     * @return FlightModifyApplyV2Response
     */
    public FlightModifyApplyV2Response flightModifyApplyV2(FlightModifyApplyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightModifyApplyV2Headers headers = new FlightModifyApplyV2Headers();
        return this.flightModifyApplyV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签取消</p>
     * 
     * @param request FlightModifyCancelV2Request
     * @param headers FlightModifyCancelV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightModifyCancelV2Response
     */
    public FlightModifyCancelV2Response flightModifyCancelV2WithOptions(FlightModifyCancelV2Request request, FlightModifyCancelV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outSubOrderId)) {
            query.put("out_sub_order_id", request.outSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subOrderId)) {
            query.put("sub_order_id", request.subOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightModifyCancelV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/modify/action/cancel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightModifyCancelV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签取消</p>
     * 
     * @param request FlightModifyCancelV2Request
     * @return FlightModifyCancelV2Response
     */
    public FlightModifyCancelV2Response flightModifyCancelV2(FlightModifyCancelV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightModifyCancelV2Headers headers = new FlightModifyCancelV2Headers();
        return this.flightModifyCancelV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签列表搜索</p>
     * 
     * @param tmpReq FlightModifyListingSearchV2Request
     * @param headers FlightModifyListingSearchV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightModifyListingSearchV2Response
     */
    public FlightModifyListingSearchV2Response flightModifyListingSearchV2WithOptions(FlightModifyListingSearchV2Request tmpReq, FlightModifyListingSearchV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightModifyListingSearchV2ShrinkRequest request = new FlightModifyListingSearchV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cabinClass)) {
            request.cabinClassShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cabinClass, "cabin_class", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depDate)) {
            request.depDateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depDate, "dep_date", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerSegmentRelations)) {
            request.passengerSegmentRelationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerSegmentRelations, "passenger_segment_relations", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.selectedSegments)) {
            request.selectedSegmentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.selectedSegments, "selected_segments", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cabinClassShrink)) {
            query.put("cabin_class", request.cabinClassShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDateShrink)) {
            query.put("dep_date", request.depDateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interfaceCallerIsSupportRetry)) {
            query.put("interface_caller_is_support_retry", request.interfaceCallerIsSupportRetry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerSegmentRelationsShrink)) {
            query.put("passenger_segment_relations", request.passengerSegmentRelationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("search_mode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRetryToken)) {
            query.put("search_retry_token", request.searchRetryToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedSegmentsShrink)) {
            query.put("selected_segments", request.selectedSegmentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("session_id", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voluntary)) {
            query.put("voluntary", request.voluntary);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightModifyListingSearchV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/modify/action/listing-search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightModifyListingSearchV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签列表搜索</p>
     * 
     * @param request FlightModifyListingSearchV2Request
     * @return FlightModifyListingSearchV2Response
     */
    public FlightModifyListingSearchV2Response flightModifyListingSearchV2(FlightModifyListingSearchV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightModifyListingSearchV2Headers headers = new FlightModifyListingSearchV2Headers();
        return this.flightModifyListingSearchV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签详情</p>
     * 
     * @param request FlightModifyOrderDetailV2Request
     * @param headers FlightModifyOrderDetailV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightModifyOrderDetailV2Response
     */
    public FlightModifyOrderDetailV2Response flightModifyOrderDetailV2WithOptions(FlightModifyOrderDetailV2Request request, FlightModifyOrderDetailV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyApplyId)) {
            query.put("modify_apply_id", request.modifyApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needQueryServiceFee)) {
            query.put("need_query_service_fee", request.needQueryServiceFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outModifyApplyId)) {
            query.put("out_modify_apply_id", request.outModifyApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightModifyOrderDetailV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/modify/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightModifyOrderDetailV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签详情</p>
     * 
     * @param request FlightModifyOrderDetailV2Request
     * @return FlightModifyOrderDetailV2Response
     */
    public FlightModifyOrderDetailV2Response flightModifyOrderDetailV2(FlightModifyOrderDetailV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightModifyOrderDetailV2Headers headers = new FlightModifyOrderDetailV2Headers();
        return this.flightModifyOrderDetailV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签报价搜索</p>
     * 
     * @param tmpReq FlightModifyOtaSearchV2Request
     * @param headers FlightModifyOtaSearchV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightModifyOtaSearchV2Response
     */
    public FlightModifyOtaSearchV2Response flightModifyOtaSearchV2WithOptions(FlightModifyOtaSearchV2Request tmpReq, FlightModifyOtaSearchV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightModifyOtaSearchV2ShrinkRequest request = new FlightModifyOtaSearchV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cabinClass)) {
            request.cabinClassShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cabinClass, "cabin_class", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depDate)) {
            request.depDateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depDate, "dep_date", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerSegmentRelations)) {
            request.passengerSegmentRelationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerSegmentRelations, "passenger_segment_relations", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.selectedSegments)) {
            request.selectedSegmentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.selectedSegments, "selected_segments", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cabinClassShrink)) {
            query.put("cabin_class", request.cabinClassShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDateShrink)) {
            query.put("dep_date", request.depDateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerSegmentRelationsShrink)) {
            query.put("passenger_segment_relations", request.passengerSegmentRelationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedSegmentsShrink)) {
            query.put("selected_segments", request.selectedSegmentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("session_id", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voluntary)) {
            query.put("voluntary", request.voluntary);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightModifyOtaSearchV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/modify/action/ota-search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightModifyOtaSearchV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签报价搜索</p>
     * 
     * @param request FlightModifyOtaSearchV2Request
     * @return FlightModifyOtaSearchV2Response
     */
    public FlightModifyOtaSearchV2Response flightModifyOtaSearchV2(FlightModifyOtaSearchV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightModifyOtaSearchV2Headers headers = new FlightModifyOtaSearchV2Headers();
        return this.flightModifyOtaSearchV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签支付</p>
     * 
     * @param tmpReq FlightModifyPayV2Request
     * @param headers FlightModifyPayV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightModifyPayV2Response
     */
    public FlightModifyPayV2Response flightModifyPayV2WithOptions(FlightModifyPayV2Request tmpReq, FlightModifyPayV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightModifyPayV2ShrinkRequest request = new FlightModifyPayV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extParams)) {
            request.extParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extParams, "ext_params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extParamsShrink)) {
            body.put("ext_params", request.extParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            body.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyPayAmount)) {
            body.put("modify_pay_amount", request.modifyPayAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outSubOrderId)) {
            body.put("out_sub_order_id", request.outSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subOrderId)) {
            body.put("sub_order_id", request.subOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightModifyPayV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/modify/action/pay"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightModifyPayV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签支付</p>
     * 
     * @param request FlightModifyPayV2Request
     * @return FlightModifyPayV2Response
     */
    public FlightModifyPayV2Response flightModifyPayV2(FlightModifyPayV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightModifyPayV2Headers headers = new FlightModifyPayV2Headers();
        return this.flightModifyPayV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>航班订单明细信息</p>
     * 
     * @param request FlightOrderDetailInfoRequest
     * @param headers FlightOrderDetailInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightOrderDetailInfoResponse
     */
    public FlightOrderDetailInfoResponse flightOrderDetailInfoWithOptions(FlightOrderDetailInfoRequest request, FlightOrderDetailInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightOrderDetailInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/order/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightOrderDetailInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>航班订单明细信息</p>
     * 
     * @param request FlightOrderDetailInfoRequest
     * @return FlightOrderDetailInfoResponse
     */
    public FlightOrderDetailInfoResponse flightOrderDetailInfo(FlightOrderDetailInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOrderDetailInfoHeaders headers = new FlightOrderDetailInfoHeaders();
        return this.flightOrderDetailInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票订单详情</p>
     * 
     * @param request FlightOrderDetailV2Request
     * @param headers FlightOrderDetailV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightOrderDetailV2Response
     */
    public FlightOrderDetailV2Response flightOrderDetailV2WithOptions(FlightOrderDetailV2Request request, FlightOrderDetailV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightOrderDetailV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/order/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightOrderDetailV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票订单详情</p>
     * 
     * @param request FlightOrderDetailV2Request
     * @return FlightOrderDetailV2Response
     */
    public FlightOrderDetailV2Response flightOrderDetailV2(FlightOrderDetailV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOrderDetailV2Headers headers = new FlightOrderDetailV2Headers();
        return this.flightOrderDetailV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询机票订单列表</p>
     * 
     * @param request FlightOrderListQueryRequest
     * @param headers FlightOrderListQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightOrderListQueryResponse
     */
    public FlightOrderListQueryResponse flightOrderListQueryWithOptions(FlightOrderListQueryRequest request, FlightOrderListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allApply)) {
            query.put("all_apply", request.allApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            query.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            query.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            query.put("update_end_time", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStartTime)) {
            query.put("update_start_time", request.updateStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightOrderListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/flight/v1/order-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightOrderListQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询机票订单列表</p>
     * 
     * @param request FlightOrderListQueryRequest
     * @return FlightOrderListQueryResponse
     */
    public FlightOrderListQueryResponse flightOrderListQuery(FlightOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOrderListQueryHeaders headers = new FlightOrderListQueryHeaders();
        return this.flightOrderListQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询机票订单详情（含票信息）</p>
     * 
     * @param request FlightOrderQueryRequest
     * @param headers FlightOrderQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightOrderQueryResponse
     */
    public FlightOrderQueryResponse flightOrderQueryWithOptions(FlightOrderQueryRequest request, FlightOrderQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightOrderQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/flight/v1/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightOrderQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询机票订单详情（含票信息）</p>
     * 
     * @param request FlightOrderQueryRequest
     * @return FlightOrderQueryResponse
     */
    public FlightOrderQueryResponse flightOrderQuery(FlightOrderQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOrderQueryHeaders headers = new FlightOrderQueryHeaders();
        return this.flightOrderQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询退改规则行李额</p>
     * 
     * @param request FlightOtaItemDetailRequest
     * @param headers FlightOtaItemDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightOtaItemDetailResponse
     */
    public FlightOtaItemDetailResponse flightOtaItemDetailWithOptions(FlightOtaItemDetailRequest request, FlightOtaItemDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaItemId)) {
            query.put("ota_item_id", request.otaItemId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightOtaItemDetail"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/flight/action/ota-item-detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightOtaItemDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询退改规则行李额</p>
     * 
     * @param request FlightOtaItemDetailRequest
     * @return FlightOtaItemDetailResponse
     */
    public FlightOtaItemDetailResponse flightOtaItemDetail(FlightOtaItemDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOtaItemDetailHeaders headers = new FlightOtaItemDetailHeaders();
        return this.flightOtaItemDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>航班最低价搜索</p>
     * 
     * @param request FlightOtaSearchRequest
     * @param headers FlightOtaSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightOtaSearchResponse
     */
    public FlightOtaSearchResponse flightOtaSearchWithOptions(FlightOtaSearchRequest request, FlightOtaSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airlineCode)) {
            query.put("airline_code", request.airlineCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityCode)) {
            query.put("arr_city_code", request.arrCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinClass)) {
            query.put("cabin_class", request.cabinClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carrierFlightNo)) {
            query.put("carrier_flight_no", request.carrierFlightNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityCode)) {
            query.put("dep_city_code", request.depCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            query.put("dep_date", request.depDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flightNo)) {
            query.put("flight_no", request.flightNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightOtaSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/flight/action/ota-search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightOtaSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>航班最低价搜索</p>
     * 
     * @param request FlightOtaSearchRequest
     * @return FlightOtaSearchResponse
     */
    public FlightOtaSearchResponse flightOtaSearch(FlightOtaSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOtaSearchHeaders headers = new FlightOtaSearchHeaders();
        return this.flightOtaSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>单航班报价搜索</p>
     * 
     * @param tmpReq FlightOtaSearchV2Request
     * @param headers FlightOtaSearchV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightOtaSearchV2Response
     */
    public FlightOtaSearchV2Response flightOtaSearchV2WithOptions(FlightOtaSearchV2Request tmpReq, FlightOtaSearchV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightOtaSearchV2ShrinkRequest request = new FlightOtaSearchV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cabinTypeList)) {
            request.cabinTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cabinTypeList, "cabin_type_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchJourneys)) {
            request.searchJourneysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchJourneys, "search_journeys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cabinTypeListShrink)) {
            query.put("cabin_type_list", request.cabinTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directOnly)) {
            query.put("direct_only", request.directOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needShareFlight)) {
            query.put("need_share_flight", request.needShareFlight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchJourneysShrink)) {
            query.put("search_journeys", request.searchJourneysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("search_mode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripType)) {
            query.put("trip_type", request.tripType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightOtaSearchV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/flight/action/ota-search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightOtaSearchV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>单航班报价搜索</p>
     * 
     * @param request FlightOtaSearchV2Request
     * @return FlightOtaSearchV2Response
     */
    public FlightOtaSearchV2Response flightOtaSearchV2(FlightOtaSearchV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOtaSearchV2Headers headers = new FlightOtaSearchV2Headers();
        return this.flightOtaSearchV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>航班订单支付</p>
     * 
     * @param tmpReq FlightPayOrderRequest
     * @param headers FlightPayOrderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightPayOrderResponse
     */
    public FlightPayOrderResponse flightPayOrderWithOptions(FlightPayOrderRequest tmpReq, FlightPayOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightPayOrderShrinkRequest request = new FlightPayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "extra", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpPayPrice)) {
            body.put("corp_pay_price", request.corpPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            body.put("extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalPayPrice)) {
            body.put("personal_pay_price", request.personalPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalPayPrice)) {
            body.put("total_pay_price", request.totalPayPrice);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightPayOrder"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/order/action/pay"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightPayOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>航班订单支付</p>
     * 
     * @param request FlightPayOrderRequest
     * @return FlightPayOrderResponse
     */
    public FlightPayOrderResponse flightPayOrder(FlightPayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightPayOrderHeaders headers = new FlightPayOrderHeaders();
        return this.flightPayOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票订单支付</p>
     * 
     * @param request FlightPayOrderV2Request
     * @param headers FlightPayOrderV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightPayOrderV2Response
     */
    public FlightPayOrderV2Response flightPayOrderV2WithOptions(FlightPayOrderV2Request request, FlightPayOrderV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            body.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalPrice)) {
            body.put("total_price", request.totalPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalServiceFeePrice)) {
            body.put("total_service_fee_price", request.totalServiceFeePrice);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightPayOrderV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/order/action/pay"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightPayOrderV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票订单支付</p>
     * 
     * @param request FlightPayOrderV2Request
     * @return FlightPayOrderV2Response
     */
    public FlightPayOrderV2Response flightPayOrderV2(FlightPayOrderV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightPayOrderV2Headers headers = new FlightPayOrderV2Headers();
        return this.flightPayOrderV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>航班退票申请</p>
     * 
     * @param tmpReq FlightRefundApplyRequest
     * @param headers FlightRefundApplyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightRefundApplyResponse
     */
    public FlightRefundApplyResponse flightRefundApplyWithOptions(FlightRefundApplyRequest tmpReq, FlightRefundApplyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightRefundApplyShrinkRequest request = new FlightRefundApplyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "extra", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerSegmentInfoList)) {
            request.passengerSegmentInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerSegmentInfoList, "passenger_segment_info_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.refundVoucherInfo)) {
            request.refundVoucherInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.refundVoucherInfo, "refund_voucher_info", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpRefundPrice)) {
            body.put("corp_refund_price", request.corpRefundPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            body.put("dis_sub_order_id", request.disSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayRefundMoney)) {
            body.put("display_refund_money", request.displayRefundMoney);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            body.put("extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isVoluntary)) {
            body.put("is_voluntary", request.isVoluntary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemUnitIds)) {
            body.put("item_unit_ids", request.itemUnitIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerSegmentInfoListShrink)) {
            body.put("passenger_segment_info_list", request.passengerSegmentInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalRefundPrice)) {
            body.put("personal_refund_price", request.personalRefundPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasonDetail)) {
            body.put("reason_detail", request.reasonDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasonType)) {
            body.put("reason_type", request.reasonType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundVoucherInfoShrink)) {
            body.put("refund_voucher_info", request.refundVoucherInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("session_id", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalRefundPrice)) {
            body.put("total_refund_price", request.totalRefundPrice);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightRefundApply"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/refund/action/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightRefundApplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>航班退票申请</p>
     * 
     * @param request FlightRefundApplyRequest
     * @return FlightRefundApplyResponse
     */
    public FlightRefundApplyResponse flightRefundApply(FlightRefundApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightRefundApplyHeaders headers = new FlightRefundApplyHeaders();
        return this.flightRefundApplyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票退票申请</p>
     * 
     * @param tmpReq FlightRefundApplyV2Request
     * @param headers FlightRefundApplyV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightRefundApplyV2Response
     */
    public FlightRefundApplyV2Response flightRefundApplyV2WithOptions(FlightRefundApplyV2Request tmpReq, FlightRefundApplyV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightRefundApplyV2ShrinkRequest request = new FlightRefundApplyV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerSegmentRelations)) {
            request.passengerSegmentRelationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerSegmentRelations, "passenger_segment_relations", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ticketNos)) {
            request.ticketNosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ticketNos, "ticket_nos", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            body.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outSubOrderId)) {
            body.put("out_sub_order_id", request.outSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerSegmentRelationsShrink)) {
            body.put("passenger_segment_relations", request.passengerSegmentRelationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preCalType)) {
            body.put("pre_cal_type", request.preCalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundReason)) {
            body.put("refund_reason", request.refundReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundReasonType)) {
            body.put("refund_reason_type", request.refundReasonType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketNosShrink)) {
            body.put("ticket_nos", request.ticketNosShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalRefundPrice)) {
            body.put("total_refund_price", request.totalRefundPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadPictUrls)) {
            body.put("upload_pict_urls", request.uploadPictUrls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voluntary)) {
            body.put("voluntary", request.voluntary);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightRefundApplyV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/refund/action/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightRefundApplyV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票退票申请</p>
     * 
     * @param request FlightRefundApplyV2Request
     * @return FlightRefundApplyV2Response
     */
    public FlightRefundApplyV2Response flightRefundApplyV2(FlightRefundApplyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightRefundApplyV2Headers headers = new FlightRefundApplyV2Headers();
        return this.flightRefundApplyV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>航班退票详情</p>
     * 
     * @param request FlightRefundDetailRequest
     * @param headers FlightRefundDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightRefundDetailResponse
     */
    public FlightRefundDetailResponse flightRefundDetailWithOptions(FlightRefundDetailRequest request, FlightRefundDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            query.put("dis_sub_order_id", request.disSubOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightRefundDetail"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/refund/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightRefundDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>航班退票详情</p>
     * 
     * @param request FlightRefundDetailRequest
     * @return FlightRefundDetailResponse
     */
    public FlightRefundDetailResponse flightRefundDetail(FlightRefundDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightRefundDetailHeaders headers = new FlightRefundDetailHeaders();
        return this.flightRefundDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票退票详情</p>
     * 
     * @param request FlightRefundDetailV2Request
     * @param headers FlightRefundDetailV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightRefundDetailV2Response
     */
    public FlightRefundDetailV2Response flightRefundDetailV2WithOptions(FlightRefundDetailV2Request request, FlightRefundDetailV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outRefundApplyId)) {
            query.put("out_refund_apply_id", request.outRefundApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundApplyId)) {
            query.put("refund_apply_id", request.refundApplyId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightRefundDetailV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/refund/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightRefundDetailV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票退票详情</p>
     * 
     * @param request FlightRefundDetailV2Request
     * @return FlightRefundDetailV2Response
     */
    public FlightRefundDetailV2Response flightRefundDetailV2(FlightRefundDetailV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightRefundDetailV2Headers headers = new FlightRefundDetailV2Headers();
        return this.flightRefundDetailV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票退票预计算</p>
     * 
     * @param tmpReq FlightRefundPreCalRequest
     * @param headers FlightRefundPreCalHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightRefundPreCalResponse
     */
    public FlightRefundPreCalResponse flightRefundPreCalWithOptions(FlightRefundPreCalRequest tmpReq, FlightRefundPreCalHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightRefundPreCalShrinkRequest request = new FlightRefundPreCalShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerSegmentInfoList)) {
            request.passengerSegmentInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerSegmentInfoList, "passenger_segment_info_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isVoluntary)) {
            query.put("is_voluntary", request.isVoluntary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerSegmentInfoListShrink)) {
            query.put("passenger_segment_info_list", request.passengerSegmentInfoListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightRefundPreCal"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/refund/action/pre-cal"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightRefundPreCalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>机票退票预计算</p>
     * 
     * @param request FlightRefundPreCalRequest
     * @return FlightRefundPreCalResponse
     */
    public FlightRefundPreCalResponse flightRefundPreCal(FlightRefundPreCalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightRefundPreCalHeaders headers = new FlightRefundPreCalHeaders();
        return this.flightRefundPreCalWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票退票费用预计算</p>
     * 
     * @param tmpReq FlightRefundPreCalV2Request
     * @param headers FlightRefundPreCalV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightRefundPreCalV2Response
     */
    public FlightRefundPreCalV2Response flightRefundPreCalV2WithOptions(FlightRefundPreCalV2Request tmpReq, FlightRefundPreCalV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightRefundPreCalV2ShrinkRequest request = new FlightRefundPreCalV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerSegmentRelations)) {
            request.passengerSegmentRelationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerSegmentRelations, "passenger_segment_relations", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ticketNos)) {
            request.ticketNosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ticketNos, "ticket_nos", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerSegmentRelationsShrink)) {
            query.put("passenger_segment_relations", request.passengerSegmentRelationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preCalType)) {
            query.put("pre_cal_type", request.preCalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketNosShrink)) {
            query.put("ticket_nos", request.ticketNosShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voluntary)) {
            query.put("voluntary", request.voluntary);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightRefundPreCalV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v2/refund/action/pre-cal"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightRefundPreCalV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>机票退票费用预计算</p>
     * 
     * @param request FlightRefundPreCalV2Request
     * @return FlightRefundPreCalV2Response
     */
    public FlightRefundPreCalV2Response flightRefundPreCalV2(FlightRefundPreCalV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightRefundPreCalV2Headers headers = new FlightRefundPreCalV2Headers();
        return this.flightRefundPreCalV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>航班列表搜索</p>
     * 
     * @param request FlightSearchListRequest
     * @param headers FlightSearchListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightSearchListResponse
     */
    public FlightSearchListResponse flightSearchListWithOptions(FlightSearchListRequest request, FlightSearchListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airlineCode)) {
            query.put("airline_code", request.airlineCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityCode)) {
            query.put("arr_city_code", request.arrCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityName)) {
            query.put("arr_city_name", request.arrCityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrDate)) {
            query.put("arr_date", request.arrDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinClass)) {
            query.put("cabin_class", request.cabinClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityCode)) {
            query.put("dep_city_code", request.depCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityName)) {
            query.put("dep_city_name", request.depCityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            query.put("dep_date", request.depDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flightNo)) {
            query.put("flight_no", request.flightNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needMultiClassPrice)) {
            query.put("need_multi_class_price", request.needMultiClassPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferCityCode)) {
            query.put("transfer_city_code", request.transferCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferFlightNo)) {
            query.put("transfer_flight_no", request.transferFlightNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferLeaveDate)) {
            query.put("transfer_leave_date", request.transferLeaveDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripType)) {
            query.put("trip_type", request.tripType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightSearchList"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/huge/dtb-flight/v1/flight/action/search-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightSearchListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>航班列表搜索</p>
     * 
     * @param request FlightSearchListRequest
     * @return FlightSearchListResponse
     */
    public FlightSearchListResponse flightSearchList(FlightSearchListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightSearchListHeaders headers = new FlightSearchListHeaders();
        return this.flightSearchListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>换取GroupCorpToken接口</p>
     * 
     * @param request GroupCorpTokenRequest
     * @param headers GroupCorpTokenHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GroupCorpTokenResponse
     */
    public GroupCorpTokenResponse groupCorpTokenWithOptions(GroupCorpTokenRequest request, GroupCorpTokenHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appSecret)) {
            query.put("app_secret", request.appSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("corp_id", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            query.put("sub_corp_id", request.subCorpId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripAccessToken)) {
            realHeaders.put("x-acs-btrip-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GroupCorpToken"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/btrip-open-auth/v1/group-corp-token/action/take"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GroupCorpTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>换取GroupCorpToken接口</p>
     * 
     * @param request GroupCorpTokenRequest
     * @return GroupCorpTokenResponse
     */
    public GroupCorpTokenResponse groupCorpToken(GroupCorpTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GroupCorpTokenHeaders headers = new GroupCorpTokenHeaders();
        return this.groupCorpTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>集团部门同步</p>
     * 
     * @param tmpReq GroupDepartSaveRequest
     * @param headers GroupDepartSaveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GroupDepartSaveResponse
     */
    public GroupDepartSaveResponse groupDepartSaveWithOptions(GroupDepartSaveRequest tmpReq, GroupDepartSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GroupDepartSaveShrinkRequest request = new GroupDepartSaveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subCorpIdList)) {
            request.subCorpIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subCorpIdList, "sub_corp_id_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deptName)) {
            body.put("dept_name", request.deptName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerIds)) {
            body.put("manager_ids", request.managerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerDeptId)) {
            body.put("outer_dept_id", request.outerDeptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerDeptPid)) {
            body.put("outer_dept_pid", request.outerDeptPid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpIdListShrink)) {
            body.put("sub_corp_id_list", request.subCorpIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncGroup)) {
            body.put("sync_group", request.syncGroup);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GroupDepartSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sub_corps/v1/departs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GroupDepartSaveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>集团部门同步</p>
     * 
     * @param request GroupDepartSaveRequest
     * @return GroupDepartSaveResponse
     */
    public GroupDepartSaveResponse groupDepartSave(GroupDepartSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GroupDepartSaveHeaders headers = new GroupDepartSaveHeaders();
        return this.groupDepartSaveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>集团人员同步</p>
     * 
     * @param tmpReq GroupUserSaveRequest
     * @param headers GroupUserSaveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GroupUserSaveResponse
     */
    public GroupUserSaveResponse groupUserSaveWithOptions(GroupUserSaveRequest tmpReq, GroupUserSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GroupUserSaveShrinkRequest request = new GroupUserSaveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.certList)) {
            request.certListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.certList, "cert_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subCorpIdList)) {
            request.subCorpIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subCorpIdList, "sub_corp_id_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseCityCode)) {
            body.put("base_city_code", request.baseCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.birthday)) {
            body.put("birthday", request.birthday);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certListShrink)) {
            body.put("cert_list", request.certListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobNo)) {
            body.put("job_no", request.jobNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realNameEn)) {
            body.put("real_name_en", request.realNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpIdListShrink)) {
            body.put("sub_corp_id_list", request.subCorpIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("user_name", request.userName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GroupUserSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sub_corps/v1/users"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GroupUserSaveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>集团人员同步</p>
     * 
     * @param request GroupUserSaveRequest
     * @return GroupUserSaveResponse
     */
    public GroupUserSaveResponse groupUserSave(GroupUserSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GroupUserSaveHeaders headers = new GroupUserSaveHeaders();
        return this.groupUserSaveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店起价</p>
     * 
     * @param tmpReq HotelAskingPriceRequest
     * @param headers HotelAskingPriceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelAskingPriceResponse
     */
    public HotelAskingPriceResponse hotelAskingPriceWithOptions(HotelAskingPriceRequest tmpReq, HotelAskingPriceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelAskingPriceShrinkRequest request = new HotelAskingPriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shids)) {
            request.shidsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shids, "shids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adultNum)) {
            query.put("adult_num", request.adultNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkInDate)) {
            query.put("check_in_date", request.checkInDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOutDate)) {
            query.put("check_out_date", request.checkOutDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("city_code", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityName)) {
            query.put("city_name", request.cityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dir)) {
            query.put("dir", request.dir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelStar)) {
            query.put("hotel_star", request.hotelStar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isProtocol)) {
            query.put("is_protocol", request.isProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("payment_type", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shidsShrink)) {
            query.put("shids", request.shidsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortCode)) {
            query.put("sort_code", request.sortCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelAskingPrice"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/hotels/action/asking-price"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelAskingPriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店起价</p>
     * 
     * @param request HotelAskingPriceRequest
     * @return HotelAskingPriceResponse
     */
    public HotelAskingPriceResponse hotelAskingPrice(HotelAskingPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelAskingPriceHeaders headers = new HotelAskingPriceHeaders();
        return this.hotelAskingPriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店记账数据</p>
     * 
     * @param request HotelBillSettlementQueryRequest
     * @param headers HotelBillSettlementQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelBillSettlementQueryResponse
     */
    public HotelBillSettlementQueryResponse hotelBillSettlementQueryWithOptions(HotelBillSettlementQueryRequest request, HotelBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/hotel/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelBillSettlementQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店记账数据</p>
     * 
     * @param request HotelBillSettlementQueryRequest
     * @return HotelBillSettlementQueryResponse
     */
    public HotelBillSettlementQueryResponse hotelBillSettlementQuery(HotelBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelBillSettlementQueryHeaders headers = new HotelBillSettlementQueryHeaders();
        return this.hotelBillSettlementQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店城市列表</p>
     * 
     * @param request HotelCityCodeListRequest
     * @param headers HotelCityCodeListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelCityCodeListResponse
     */
    public HotelCityCodeListResponse hotelCityCodeListWithOptions(HotelCityCodeListRequest request, HotelCityCodeListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            query.put("country_code", request.countryCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelCityCodeList"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/city-codes/action/search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelCityCodeListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店城市列表</p>
     * 
     * @param request HotelCityCodeListRequest
     * @return HotelCityCodeListResponse
     */
    public HotelCityCodeListResponse hotelCityCodeList(HotelCityCodeListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelCityCodeListHeaders headers = new HotelCityCodeListHeaders();
        return this.hotelCityCodeListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店超标审批详情</p>
     * 
     * @param request HotelExceedApplyQueryRequest
     * @param headers HotelExceedApplyQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelExceedApplyQueryResponse
     */
    public HotelExceedApplyQueryResponse hotelExceedApplyQueryWithOptions(HotelExceedApplyQueryRequest request, HotelExceedApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInstanceId)) {
            query.put("business_instance_id", request.businessInstanceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelExceedApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/hotel-exceed"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelExceedApplyQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店超标审批详情</p>
     * 
     * @param request HotelExceedApplyQueryRequest
     * @return HotelExceedApplyQueryResponse
     */
    public HotelExceedApplyQueryResponse hotelExceedApplyQuery(HotelExceedApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelExceedApplyQueryHeaders headers = new HotelExceedApplyQueryHeaders();
        return this.hotelExceedApplyQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店详情页报价接口(直连)</p>
     * 
     * @param request HotelGoodsQueryRequest
     * @param headers HotelGoodsQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelGoodsQueryResponse
     */
    public HotelGoodsQueryResponse hotelGoodsQueryWithOptions(HotelGoodsQueryRequest request, HotelGoodsQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adultNum)) {
            query.put("adult_num", request.adultNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agreementPrice)) {
            query.put("agreement_price", request.agreementPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginDate)) {
            query.put("begin_date", request.beginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.breakfastIncluded)) {
            query.put("breakfast_included", request.breakfastIncluded);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("city_code", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("end_date", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            query.put("hotel_id", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payOverType)) {
            query.put("pay_over_type", request.payOverType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("payment_type", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specialInvoice)) {
            query.put("special_invoice", request.specialInvoice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.superMan)) {
            query.put("super_man", request.superMan);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelGoodsQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/hotel-goods"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelGoodsQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店详情页报价接口(直连)</p>
     * 
     * @param request HotelGoodsQueryRequest
     * @return HotelGoodsQueryResponse
     */
    public HotelGoodsQueryResponse hotelGoodsQuery(HotelGoodsQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelGoodsQueryHeaders headers = new HotelGoodsQueryHeaders();
        return this.hotelGoodsQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店清单</p>
     * 
     * @param request HotelIndexInfoRequest
     * @param headers HotelIndexInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelIndexInfoResponse
     */
    public HotelIndexInfoResponse hotelIndexInfoWithOptions(HotelIndexInfoRequest request, HotelIndexInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("city_code", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelStatus)) {
            query.put("hotel_status", request.hotelStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("page_token", request.pageToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelIndexInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/index-infos"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelIndexInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店清单</p>
     * 
     * @param request HotelIndexInfoRequest
     * @return HotelIndexInfoResponse
     */
    public HotelIndexInfoResponse hotelIndexInfo(HotelIndexInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelIndexInfoHeaders headers = new HotelIndexInfoHeaders();
        return this.hotelIndexInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单取消</p>
     * 
     * @param request HotelOrderCancelRequest
     * @param headers HotelOrderCancelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelOrderCancelResponse
     */
    public HotelOrderCancelResponse hotelOrderCancelWithOptions(HotelOrderCancelRequest request, HotelOrderCancelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripOrderId)) {
            query.put("btrip_order_id", request.btripOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderCancel"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/cancel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderCancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单取消</p>
     * 
     * @param request HotelOrderCancelRequest
     * @return HotelOrderCancelResponse
     */
    public HotelOrderCancelResponse hotelOrderCancel(HotelOrderCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderCancelHeaders headers = new HotelOrderCancelHeaders();
        return this.hotelOrderCancelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单修改申请</p>
     * 
     * @param tmpReq HotelOrderChangeApplyRequest
     * @param headers HotelOrderChangeApplyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelOrderChangeApplyResponse
     */
    public HotelOrderChangeApplyResponse hotelOrderChangeApplyWithOptions(HotelOrderChangeApplyRequest tmpReq, HotelOrderChangeApplyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelOrderChangeApplyShrinkRequest request = new HotelOrderChangeApplyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomInfoList)) {
            request.roomInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomInfoList, "room_info_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomInfoListShrink)) {
            body.put("room_info_list", request.roomInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleOrderId)) {
            body.put("sale_order_id", request.saleOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderChangeApply"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/change/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderChangeApplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单修改申请</p>
     * 
     * @param request HotelOrderChangeApplyRequest
     * @return HotelOrderChangeApplyResponse
     */
    public HotelOrderChangeApplyResponse hotelOrderChangeApply(HotelOrderChangeApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderChangeApplyHeaders headers = new HotelOrderChangeApplyHeaders();
        return this.hotelOrderChangeApplyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单修改详情</p>
     * 
     * @param request HotelOrderChangeDetailRequest
     * @param headers HotelOrderChangeDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelOrderChangeDetailResponse
     */
    public HotelOrderChangeDetailResponse hotelOrderChangeDetailWithOptions(HotelOrderChangeDetailRequest request, HotelOrderChangeDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            body.put("change_order_id", request.changeOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleOrderId)) {
            body.put("sale_order_id", request.saleOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderChangeDetail"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/change/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderChangeDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单修改详情</p>
     * 
     * @param request HotelOrderChangeDetailRequest
     * @return HotelOrderChangeDetailResponse
     */
    public HotelOrderChangeDetailResponse hotelOrderChangeDetail(HotelOrderChangeDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderChangeDetailHeaders headers = new HotelOrderChangeDetailHeaders();
        return this.hotelOrderChangeDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单创建</p>
     * 
     * @param tmpReq HotelOrderCreateRequest
     * @param headers HotelOrderCreateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelOrderCreateResponse
     */
    public HotelOrderCreateResponse hotelOrderCreateWithOptions(HotelOrderCreateRequest tmpReq, HotelOrderCreateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelOrderCreateShrinkRequest request = new HotelOrderCreateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.invoiceInfo)) {
            request.invoiceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.invoiceInfo, "invoice_info", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.occupantInfoList)) {
            request.occupantInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.occupantInfoList, "occupant_info_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.promotionInfo)) {
            request.promotionInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.promotionInfo, "promotion_info", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkIn)) {
            body.put("check_in", request.checkIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOut)) {
            body.put("check_out", request.checkOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractEmail)) {
            body.put("contract_email", request.contractEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractName)) {
            body.put("contract_name", request.contractName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractPhone)) {
            body.put("contract_phone", request.contractPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpPayPrice)) {
            body.put("corp_pay_price", request.corpPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceInfoShrink)) {
            body.put("invoice_info", request.invoiceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("item_id", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryNo)) {
            body.put("itinerary_no", request.itineraryNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.occupantInfoListShrink)) {
            body.put("occupant_info_list", request.occupantInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personPayPrice)) {
            body.put("person_pay_price", request.personPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionInfoShrink)) {
            body.put("promotion_info", request.promotionInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ratePlanId)) {
            body.put("rate_plan_id", request.ratePlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("room_id", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNum)) {
            body.put("room_num", request.roomNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            body.put("seller_id", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shid)) {
            body.put("shid", request.shid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalOrderPrice)) {
            body.put("total_order_price", request.totalOrderPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validateResKey)) {
            body.put("validate_res_key", request.validateResKey);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderCreate"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单创建</p>
     * 
     * @param request HotelOrderCreateRequest
     * @return HotelOrderCreateResponse
     */
    public HotelOrderCreateResponse hotelOrderCreate(HotelOrderCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderCreateHeaders headers = new HotelOrderCreateHeaders();
        return this.hotelOrderCreateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单明细信息</p>
     * 
     * @param request HotelOrderDetailInfoRequest
     * @param headers HotelOrderDetailInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelOrderDetailInfoResponse
     */
    public HotelOrderDetailInfoResponse hotelOrderDetailInfoWithOptions(HotelOrderDetailInfoRequest request, HotelOrderDetailInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripOrderId)) {
            query.put("btrip_order_id", request.btripOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderDetailInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderDetailInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单明细信息</p>
     * 
     * @param request HotelOrderDetailInfoRequest
     * @return HotelOrderDetailInfoResponse
     */
    public HotelOrderDetailInfoResponse hotelOrderDetailInfo(HotelOrderDetailInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderDetailInfoHeaders headers = new HotelOrderDetailInfoHeaders();
        return this.hotelOrderDetailInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店订单列表</p>
     * 
     * @param request HotelOrderListQueryRequest
     * @param headers HotelOrderListQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelOrderListQueryResponse
     */
    public HotelOrderListQueryResponse hotelOrderListQueryWithOptions(HotelOrderListQueryRequest request, HotelOrderListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allApply)) {
            query.put("all_apply", request.allApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            query.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            query.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            query.put("update_end_time", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStartTime)) {
            query.put("update_start_time", request.updateStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/hotel/v1/order-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderListQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店订单列表</p>
     * 
     * @param request HotelOrderListQueryRequest
     * @return HotelOrderListQueryResponse
     */
    public HotelOrderListQueryResponse hotelOrderListQuery(HotelOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderListQueryHeaders headers = new HotelOrderListQueryHeaders();
        return this.hotelOrderListQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单支付</p>
     * 
     * @param request HotelOrderPayRequest
     * @param headers HotelOrderPayHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelOrderPayResponse
     */
    public HotelOrderPayResponse hotelOrderPayWithOptions(HotelOrderPayRequest request, HotelOrderPayHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripOrderId)) {
            body.put("btrip_order_id", request.btripOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyPayFee)) {
            body.put("company_pay_fee", request.companyPayFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personPayFee)) {
            body.put("person_pay_fee", request.personPayFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPayAccount)) {
            body.put("third_pay_account", request.thirdPayAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdTradeNo)) {
            body.put("third_trade_no", request.thirdTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalPrice)) {
            body.put("total_price", request.totalPrice);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderPay"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/pay"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderPayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单支付</p>
     * 
     * @param request HotelOrderPayRequest
     * @return HotelOrderPayResponse
     */
    public HotelOrderPayResponse hotelOrderPay(HotelOrderPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderPayHeaders headers = new HotelOrderPayHeaders();
        return this.hotelOrderPayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店下单前校验</p>
     * 
     * @param tmpReq HotelOrderPreValidateRequest
     * @param headers HotelOrderPreValidateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelOrderPreValidateResponse
     */
    public HotelOrderPreValidateResponse hotelOrderPreValidateWithOptions(HotelOrderPreValidateRequest tmpReq, HotelOrderPreValidateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelOrderPreValidateShrinkRequest request = new HotelOrderPreValidateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dailyList)) {
            request.dailyListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dailyList, "daily_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.occupantInfoList)) {
            request.occupantInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.occupantInfoList, "occupant_info_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkIn)) {
            query.put("check_in", request.checkIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOut)) {
            query.put("check_out", request.checkOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dailyListShrink)) {
            query.put("daily_list", request.dailyListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("item_id", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberOfAdultsPerRoom)) {
            query.put("number_of_adults_per_room", request.numberOfAdultsPerRoom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.occupantInfoListShrink)) {
            query.put("occupant_info_list", request.occupantInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ratePlanId)) {
            query.put("rate_plan_id", request.ratePlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            query.put("room_id", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNum)) {
            query.put("room_num", request.roomNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRoomPrice)) {
            query.put("search_room_price", request.searchRoomPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            query.put("seller_id", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shid)) {
            query.put("shid", request.shid);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderPreValidate"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/pre-validate"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderPreValidateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店下单前校验</p>
     * 
     * @param request HotelOrderPreValidateRequest
     * @return HotelOrderPreValidateResponse
     */
    public HotelOrderPreValidateResponse hotelOrderPreValidate(HotelOrderPreValidateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderPreValidateHeaders headers = new HotelOrderPreValidateHeaders();
        return this.hotelOrderPreValidateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单查询</p>
     * 
     * @param request HotelOrderQueryRequest
     * @param headers HotelOrderQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelOrderQueryResponse
     */
    public HotelOrderQueryResponse hotelOrderQueryWithOptions(HotelOrderQueryRequest request, HotelOrderQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/hotel/v1/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店订单查询</p>
     * 
     * @param request HotelOrderQueryRequest
     * @return HotelOrderQueryResponse
     */
    public HotelOrderQueryResponse hotelOrderQuery(HotelOrderQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderQueryHeaders headers = new HotelOrderQueryHeaders();
        return this.hotelOrderQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店拉动态拉取价格接口(落地)</p>
     * 
     * @param tmpReq HotelPricePullRequest
     * @param headers HotelPricePullHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelPricePullResponse
     */
    public HotelPricePullResponse hotelPricePullWithOptions(HotelPricePullRequest tmpReq, HotelPricePullHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelPricePullShrinkRequest request = new HotelPricePullShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelIds)) {
            request.hotelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelIds, "hotel_ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkIn)) {
            query.put("check_in", request.checkIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOut)) {
            query.put("check_out", request.checkOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("city_code", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelIdsShrink)) {
            query.put("hotel_ids", request.hotelIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("payment_type", request.paymentType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelPricePull"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/prices/action/pull"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelPricePullResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店拉动态拉取价格接口(落地)</p>
     * 
     * @param request HotelPricePullRequest
     * @return HotelPricePullResponse
     */
    public HotelPricePullResponse hotelPricePull(HotelPricePullRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelPricePullHeaders headers = new HotelPricePullHeaders();
        return this.hotelPricePullWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店静态房型详情</p>
     * 
     * @param tmpReq HotelRoomInfoRequest
     * @param headers HotelRoomInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelRoomInfoResponse
     */
    public HotelRoomInfoResponse hotelRoomInfoWithOptions(HotelRoomInfoRequest tmpReq, HotelRoomInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelRoomInfoShrinkRequest request = new HotelRoomInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomIds)) {
            request.roomIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomIds, "room_ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roomIdsShrink)) {
            query.put("room_ids", request.roomIdsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelRoomInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/room-infos"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelRoomInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取酒店静态房型详情</p>
     * 
     * @param request HotelRoomInfoRequest
     * @return HotelRoomInfoResponse
     */
    public HotelRoomInfoResponse hotelRoomInfo(HotelRoomInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelRoomInfoHeaders headers = new HotelRoomInfoHeaders();
        return this.hotelRoomInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店列表搜索接口(直连)</p>
     * 
     * @param tmpReq HotelSearchRequest
     * @param headers HotelSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelSearchResponse
     */
    public HotelSearchResponse hotelSearchWithOptions(HotelSearchRequest tmpReq, HotelSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelSearchShrinkRequest request = new HotelSearchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.brandCode)) {
            request.brandCodeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.brandCode, "brand_code", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shids)) {
            request.shidsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shids, "shids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adultNum)) {
            query.put("adult_num", request.adultNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.brandCodeShrink)) {
            query.put("brand_code", request.brandCodeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkInDate)) {
            query.put("check_in_date", request.checkInDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOutDate)) {
            query.put("check_out_date", request.checkOutDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("city_code", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dir)) {
            query.put("dir", request.dir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distance)) {
            query.put("distance", request.distance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtCode)) {
            query.put("district_code", request.districtCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelStar)) {
            query.put("hotel_star", request.hotelStar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isProtocol)) {
            query.put("is_protocol", request.isProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWords)) {
            query.put("key_words", request.keyWords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPrice)) {
            query.put("max_price", request.maxPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minPrice)) {
            query.put("min_price", request.minPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payOverType)) {
            query.put("pay_over_type", request.payOverType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("payment_type", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shidsShrink)) {
            query.put("shids", request.shidsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortCode)) {
            query.put("sort_code", request.sortCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.superMan)) {
            query.put("super_man", request.superMan);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/hotels/action/search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店列表搜索接口(直连)</p>
     * 
     * @param request HotelSearchRequest
     * @return HotelSearchResponse
     */
    public HotelSearchResponse hotelSearch(HotelSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelSearchHeaders headers = new HotelSearchHeaders();
        return this.hotelSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店静态详情</p>
     * 
     * @param tmpReq HotelStaticInfoRequest
     * @param headers HotelStaticInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotelStaticInfoResponse
     */
    public HotelStaticInfoResponse hotelStaticInfoWithOptions(HotelStaticInfoRequest tmpReq, HotelStaticInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelStaticInfoShrinkRequest request = new HotelStaticInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelIds)) {
            request.hotelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelIds, "hotel_ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelIdsShrink)) {
            query.put("hotel_ids", request.hotelIdsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelStaticInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/static-infos"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelStaticInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店静态详情</p>
     * 
     * @param request HotelStaticInfoRequest
     * @return HotelStaticInfoResponse
     */
    public HotelStaticInfoResponse hotelStaticInfo(HotelStaticInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelStaticInfoHeaders headers = new HotelStaticInfoHeaders();
        return this.hotelStaticInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询国际机票记账数据</p>
     * 
     * @param request IeFlightBillSettlementQueryRequest
     * @param headers IeFlightBillSettlementQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IeFlightBillSettlementQueryResponse
     */
    public IeFlightBillSettlementQueryResponse ieFlightBillSettlementQueryWithOptions(IeFlightBillSettlementQueryRequest request, IeFlightBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IeFlightBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ie-flight/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IeFlightBillSettlementQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询国际机票记账数据</p>
     * 
     * @param request IeFlightBillSettlementQueryRequest
     * @return IeFlightBillSettlementQueryResponse
     */
    public IeFlightBillSettlementQueryResponse ieFlightBillSettlementQuery(IeFlightBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IeFlightBillSettlementQueryHeaders headers = new IeFlightBillSettlementQueryHeaders();
        return this.ieFlightBillSettlementQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询国际/中国港澳台酒店记账数据</p>
     * 
     * @param request IeHotelBillSettlementQueryRequest
     * @param headers IeHotelBillSettlementQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IeHotelBillSettlementQueryResponse
     */
    public IeHotelBillSettlementQueryResponse ieHotelBillSettlementQueryWithOptions(IeHotelBillSettlementQueryRequest request, IeHotelBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IeHotelBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ie-hotel/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IeHotelBillSettlementQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询国际/中国港澳台酒店记账数据</p>
     * 
     * @param request IeHotelBillSettlementQueryRequest
     * @return IeHotelBillSettlementQueryResponse
     */
    public IeHotelBillSettlementQueryResponse ieHotelBillSettlementQuery(IeHotelBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IeHotelBillSettlementQueryHeaders headers = new IeHotelBillSettlementQueryHeaders();
        return this.ieHotelBillSettlementQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询保险电子发票</p>
     * 
     * @param request InsInvoiceScanQueryRequest
     * @param headers InsInvoiceScanQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsInvoiceScanQueryResponse
     */
    public InsInvoiceScanQueryResponse insInvoiceScanQueryWithOptions(InsInvoiceScanQueryRequest request, InsInvoiceScanQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            query.put("bill_date", request.billDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            query.put("bill_id", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceSubTaskId)) {
            query.put("invoice_sub_task_id", request.invoiceSubTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsInvoiceScanQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scan/v1/ins-invoice"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsInvoiceScanQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询保险电子发票</p>
     * 
     * @param request InsInvoiceScanQueryRequest
     * @return InsInvoiceScanQueryResponse
     */
    public InsInvoiceScanQueryResponse insInvoiceScanQuery(InsInvoiceScanQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsInvoiceScanQueryHeaders headers = new InsInvoiceScanQueryHeaders();
        return this.insInvoiceScanQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单申请</p>
     * 
     * @param request InsureOrderApplyRequest
     * @param headers InsureOrderApplyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsureOrderApplyResponse
     */
    public InsureOrderApplyResponse insureOrderApplyWithOptions(InsureOrderApplyRequest request, InsureOrderApplyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            body.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insOrderId)) {
            body.put("ins_order_id", request.insOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            body.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outSubOrderId)) {
            body.put("out_sub_order_id", request.outSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierCode)) {
            body.put("supplier_code", request.supplierCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsureOrderApply"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/insurances/action/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsureOrderApplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单申请</p>
     * 
     * @param request InsureOrderApplyRequest
     * @return InsureOrderApplyResponse
     */
    public InsureOrderApplyResponse insureOrderApply(InsureOrderApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsureOrderApplyHeaders headers = new InsureOrderApplyHeaders();
        return this.insureOrderApplyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单取消</p>
     * 
     * @param request InsureOrderCancelRequest
     * @param headers InsureOrderCancelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsureOrderCancelResponse
     */
    public InsureOrderCancelResponse insureOrderCancelWithOptions(String insOrderId, InsureOrderCancelRequest request, InsureOrderCancelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            query.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierCode)) {
            query.put("supplier_code", request.supplierCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsureOrderCancel"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/insurances/" + com.aliyun.openapiutil.Client.getEncodeParam(insOrderId) + "/action/cancel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsureOrderCancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单取消</p>
     * 
     * @param request InsureOrderCancelRequest
     * @return InsureOrderCancelResponse
     */
    public InsureOrderCancelResponse insureOrderCancel(String insOrderId, InsureOrderCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsureOrderCancelHeaders headers = new InsureOrderCancelHeaders();
        return this.insureOrderCancelWithOptions(insOrderId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单创建</p>
     * 
     * @param tmpReq InsureOrderCreateRequest
     * @param headers InsureOrderCreateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsureOrderCreateResponse
     */
    public InsureOrderCreateResponse insureOrderCreateWithOptions(InsureOrderCreateRequest tmpReq, InsureOrderCreateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InsureOrderCreateShrinkRequest request = new InsureOrderCreateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applicant)) {
            request.applicantShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applicant, "applicant", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.insPersonAndSegmentList)) {
            request.insPersonAndSegmentListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.insPersonAndSegmentList, "ins_person_and_segment_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicantShrink)) {
            body.put("applicant", request.applicantShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            body.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insPersonAndSegmentListShrink)) {
            body.put("ins_person_and_segment_list", request.insPersonAndSegmentListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            body.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outInsOrderId)) {
            body.put("out_ins_order_id", request.outInsOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outSubOrderId)) {
            body.put("out_sub_order_id", request.outSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierCode)) {
            body.put("supplier_code", request.supplierCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsureOrderCreate"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/insurances/action/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsureOrderCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单创建</p>
     * 
     * @param request InsureOrderCreateRequest
     * @return InsureOrderCreateResponse
     */
    public InsureOrderCreateResponse insureOrderCreate(InsureOrderCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsureOrderCreateHeaders headers = new InsureOrderCreateHeaders();
        return this.insureOrderCreateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单查询</p>
     * 
     * @param request InsureOrderDetailRequest
     * @param headers InsureOrderDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsureOrderDetailResponse
     */
    public InsureOrderDetailResponse insureOrderDetailWithOptions(InsureOrderDetailRequest request, InsureOrderDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            query.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insOrderId)) {
            query.put("ins_order_id", request.insOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierCode)) {
            query.put("supplier_code", request.supplierCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsureOrderDetail"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/insurances/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsureOrderDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单查询</p>
     * 
     * @param request InsureOrderDetailRequest
     * @return InsureOrderDetailResponse
     */
    public InsureOrderDetailResponse insureOrderDetail(InsureOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsureOrderDetailHeaders headers = new InsureOrderDetailHeaders();
        return this.insureOrderDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单支付</p>
     * 
     * @param request InsureOrderPayRequest
     * @param headers InsureOrderPayHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsureOrderPayResponse
     */
    public InsureOrderPayResponse insureOrderPayWithOptions(String insOrderId, InsureOrderPayRequest request, InsureOrderPayHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            body.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            body.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outSubOrderId)) {
            body.put("out_sub_order_id", request.outSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentAmount)) {
            body.put("payment_amount", request.paymentAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierCode)) {
            body.put("supplier_code", request.supplierCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsureOrderPay"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/insurances/" + com.aliyun.openapiutil.Client.getEncodeParam(insOrderId) + "/action/pay"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsureOrderPayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单支付</p>
     * 
     * @param request InsureOrderPayRequest
     * @return InsureOrderPayResponse
     */
    public InsureOrderPayResponse insureOrderPay(String insOrderId, InsureOrderPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsureOrderPayHeaders headers = new InsureOrderPayHeaders();
        return this.insureOrderPayWithOptions(insOrderId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单退保</p>
     * 
     * @param tmpReq InsureOrderRefundRequest
     * @param headers InsureOrderRefundHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsureOrderRefundResponse
     */
    public InsureOrderRefundResponse insureOrderRefundWithOptions(String insOrderId, InsureOrderRefundRequest tmpReq, InsureOrderRefundHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InsureOrderRefundShrinkRequest request = new InsureOrderRefundShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.policyNoList)) {
            request.policyNoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.policyNoList, "policy_no_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subInsOrderIds)) {
            request.subInsOrderIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subInsOrderIds, "sub_ins_order_ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            body.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            body.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outApplyId)) {
            body.put("out_apply_id", request.outApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyNoListShrink)) {
            body.put("policy_no_list", request.policyNoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInsOrderIdsShrink)) {
            body.put("sub_ins_order_ids", request.subInsOrderIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierCode)) {
            body.put("supplier_code", request.supplierCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsureOrderRefund"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/insurances/" + com.aliyun.openapiutil.Client.getEncodeParam(insOrderId) + "/action/refund"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsureOrderRefundResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保险订单退保</p>
     * 
     * @param request InsureOrderRefundRequest
     * @return InsureOrderRefundResponse
     */
    public InsureOrderRefundResponse insureOrderRefund(String insOrderId, InsureOrderRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsureOrderRefundHeaders headers = new InsureOrderRefundHeaders();
        return this.insureOrderRefundWithOptions(insOrderId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询保单详情链接</p>
     * 
     * @param headers InsureOrderUrlDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsureOrderUrlDetailResponse
     */
    public InsureOrderUrlDetailResponse insureOrderUrlDetailWithOptions(String insOrderId, InsureOrderUrlDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsureOrderUrlDetail"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/insurances/" + com.aliyun.openapiutil.Client.getEncodeParam(insOrderId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsureOrderUrlDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询保单详情链接</p>
     * @return InsureOrderUrlDetailResponse
     */
    public InsureOrderUrlDetailResponse insureOrderUrlDetail(String insOrderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsureOrderUrlDetailHeaders headers = new InsureOrderUrlDetailHeaders();
        return this.insureOrderUrlDetailWithOptions(insOrderId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>退保详情查询</p>
     * 
     * @param request InsureRefundDetailRequest
     * @param headers InsureRefundDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsureRefundDetailResponse
     */
    public InsureRefundDetailResponse insureRefundDetailWithOptions(InsureRefundDetailRequest request, InsureRefundDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            query.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insOrderId)) {
            query.put("ins_order_id", request.insOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outApplyId)) {
            query.put("out_apply_id", request.outApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierCode)) {
            query.put("supplier_code", request.supplierCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsureRefundDetail"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/insurances/action/refund-detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsureRefundDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>退保详情查询</p>
     * 
     * @param request InsureRefundDetailRequest
     * @return InsureRefundDetailResponse
     */
    public InsureRefundDetailResponse insureRefundDetail(InsureRefundDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsureRefundDetailHeaders headers = new InsureRefundDetailHeaders();
        return this.insureRefundDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票创建订单</p>
     * 
     * @param tmpReq IntlFlightCreateOrderRequest
     * @param headers IntlFlightCreateOrderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IntlFlightCreateOrderResponse
     */
    public IntlFlightCreateOrderResponse intlFlightCreateOrderWithOptions(IntlFlightCreateOrderRequest tmpReq, IntlFlightCreateOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IntlFlightCreateOrderShrinkRequest request = new IntlFlightCreateOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contactInfo)) {
            request.contactInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contactInfo, "contact_info", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.costCenter)) {
            request.costCenterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.costCenter, "cost_center", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraInfo)) {
            request.extraInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraInfo, "extra_info", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerList)) {
            request.passengerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerList, "passenger_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asyncCreateOrderKey)) {
            query.put("async_create_order_key", request.asyncCreateOrderKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asyncCreateOrderMode)) {
            query.put("async_create_order_mode", request.asyncCreateOrderMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactInfoShrink)) {
            query.put("contact_info", request.contactInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costCenterShrink)) {
            query.put("cost_center", request.costCenterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfoShrink)) {
            query.put("extra_info", request.extraInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaItemId)) {
            query.put("ota_item_id", request.otaItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerListShrink)) {
            query.put("passenger_list", request.passengerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderKey)) {
            query.put("render_key", request.renderKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalPriceCent)) {
            query.put("total_price_cent", request.totalPriceCent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("user_name", request.userName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IntlFlightCreateOrder"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/intl-flight/v1/order/action/create"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IntlFlightCreateOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票创建订单</p>
     * 
     * @param request IntlFlightCreateOrderRequest
     * @return IntlFlightCreateOrderResponse
     */
    public IntlFlightCreateOrderResponse intlFlightCreateOrder(IntlFlightCreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IntlFlightCreateOrderHeaders headers = new IntlFlightCreateOrderHeaders();
        return this.intlFlightCreateOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票验舱验价</p>
     * 
     * @param tmpReq IntlFlightInventoryPriceCheckRequest
     * @param headers IntlFlightInventoryPriceCheckHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IntlFlightInventoryPriceCheckResponse
     */
    public IntlFlightInventoryPriceCheckResponse intlFlightInventoryPriceCheckWithOptions(IntlFlightInventoryPriceCheckRequest tmpReq, IntlFlightInventoryPriceCheckHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IntlFlightInventoryPriceCheckShrinkRequest request = new IntlFlightInventoryPriceCheckShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerList)) {
            request.passengerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerList, "passenger_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderPrice)) {
            query.put("order_price", request.orderPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaItemId)) {
            query.put("ota_item_id", request.otaItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerListShrink)) {
            query.put("passenger_list", request.passengerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("user_name", request.userName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IntlFlightInventoryPriceCheck"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/intl-flight/v1/flights/action/inventory-price-check"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IntlFlightInventoryPriceCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票验舱验价</p>
     * 
     * @param request IntlFlightInventoryPriceCheckRequest
     * @return IntlFlightInventoryPriceCheckResponse
     */
    public IntlFlightInventoryPriceCheckResponse intlFlightInventoryPriceCheck(IntlFlightInventoryPriceCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IntlFlightInventoryPriceCheckHeaders headers = new IntlFlightInventoryPriceCheckHeaders();
        return this.intlFlightInventoryPriceCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票航班搜索</p>
     * 
     * @param tmpReq IntlFlightListingSearchRequest
     * @param headers IntlFlightListingSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IntlFlightListingSearchResponse
     */
    public IntlFlightListingSearchResponse intlFlightListingSearchWithOptions(IntlFlightListingSearchRequest tmpReq, IntlFlightListingSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IntlFlightListingSearchShrinkRequest request = new IntlFlightListingSearchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchJourneys)) {
            request.searchJourneysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchJourneys, "search_journeys", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchPassengerList)) {
            request.searchPassengerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchPassengerList, "search_passenger_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            query.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinType)) {
            query.put("cabin_type", request.cabinType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directOnly)) {
            query.put("direct_only", request.directOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needShareFlight)) {
            query.put("need_share_flight", request.needShareFlight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outWheelSearch)) {
            query.put("out_wheel_search", request.outWheelSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryRecordId)) {
            query.put("query_record_id", request.queryRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchJourneysShrink)) {
            query.put("search_journeys", request.searchJourneysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("search_mode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPassengerListShrink)) {
            query.put("search_passenger_list", request.searchPassengerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierCode)) {
            query.put("supplier_code", request.supplierCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripType)) {
            query.put("trip_type", request.tripType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IntlFlightListingSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/intl-flight/v1/flights/action/listing-search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IntlFlightListingSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票航班搜索</p>
     * 
     * @param request IntlFlightListingSearchRequest
     * @return IntlFlightListingSearchResponse
     */
    public IntlFlightListingSearchResponse intlFlightListingSearch(IntlFlightListingSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IntlFlightListingSearchHeaders headers = new IntlFlightListingSearchHeaders();
        return this.intlFlightListingSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票订单取消</p>
     * 
     * @param request IntlFlightOrderCancelRequest
     * @param headers IntlFlightOrderCancelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IntlFlightOrderCancelResponse
     */
    public IntlFlightOrderCancelResponse intlFlightOrderCancelWithOptions(IntlFlightOrderCancelRequest request, IntlFlightOrderCancelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            query.put("memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IntlFlightOrderCancel"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/intl-flight/v1/order/action/cancel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IntlFlightOrderCancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票订单取消</p>
     * 
     * @param request IntlFlightOrderCancelRequest
     * @return IntlFlightOrderCancelResponse
     */
    public IntlFlightOrderCancelResponse intlFlightOrderCancel(IntlFlightOrderCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IntlFlightOrderCancelHeaders headers = new IntlFlightOrderCancelHeaders();
        return this.intlFlightOrderCancelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票订单详情</p>
     * 
     * @param request IntlFlightOrderDetailRequest
     * @param headers IntlFlightOrderDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IntlFlightOrderDetailResponse
     */
    public IntlFlightOrderDetailResponse intlFlightOrderDetailWithOptions(IntlFlightOrderDetailRequest request, IntlFlightOrderDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IntlFlightOrderDetail"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/intl-flight/v1/order/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IntlFlightOrderDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票订单详情</p>
     * 
     * @param request IntlFlightOrderDetailRequest
     * @return IntlFlightOrderDetailResponse
     */
    public IntlFlightOrderDetailResponse intlFlightOrderDetail(IntlFlightOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IntlFlightOrderDetailHeaders headers = new IntlFlightOrderDetailHeaders();
        return this.intlFlightOrderDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票订单支付</p>
     * 
     * @param tmpReq IntlFlightOrderPayRequest
     * @param headers IntlFlightOrderPayHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IntlFlightOrderPayResponse
     */
    public IntlFlightOrderPayResponse intlFlightOrderPayWithOptions(IntlFlightOrderPayRequest tmpReq, IntlFlightOrderPayHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IntlFlightOrderPayShrinkRequest request = new IntlFlightOrderPayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extParams)) {
            request.extParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extParams, "ext_params", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extParamsShrink)) {
            query.put("ext_params", request.extParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalPrice)) {
            query.put("total_price", request.totalPrice);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IntlFlightOrderPay"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/intl-flight/v1/order/action/pay"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IntlFlightOrderPayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票订单支付</p>
     * 
     * @param request IntlFlightOrderPayRequest
     * @return IntlFlightOrderPayResponse
     */
    public IntlFlightOrderPayResponse intlFlightOrderPay(IntlFlightOrderPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IntlFlightOrderPayHeaders headers = new IntlFlightOrderPayHeaders();
        return this.intlFlightOrderPayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票订单支付前校验</p>
     * 
     * @param request IntlFlightOrderPayCheckRequest
     * @param headers IntlFlightOrderPayCheckHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IntlFlightOrderPayCheckResponse
     */
    public IntlFlightOrderPayCheckResponse intlFlightOrderPayCheckWithOptions(IntlFlightOrderPayCheckRequest request, IntlFlightOrderPayCheckHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("out_order_id", request.outOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IntlFlightOrderPayCheck"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/intl-flight/v1/order/action/pay-check"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IntlFlightOrderPayCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票订单支付前校验</p>
     * 
     * @param request IntlFlightOrderPayCheckRequest
     * @return IntlFlightOrderPayCheckResponse
     */
    public IntlFlightOrderPayCheckResponse intlFlightOrderPayCheck(IntlFlightOrderPayCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IntlFlightOrderPayCheckHeaders headers = new IntlFlightOrderPayCheckHeaders();
        return this.intlFlightOrderPayCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票报价商品详情</p>
     * 
     * @param request IntlFlightOtaItemDetailRequest
     * @param headers IntlFlightOtaItemDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IntlFlightOtaItemDetailResponse
     */
    public IntlFlightOtaItemDetailResponse intlFlightOtaItemDetailWithOptions(String otaItemId, IntlFlightOtaItemDetailRequest request, IntlFlightOtaItemDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            query.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierCode)) {
            query.put("supplier_code", request.supplierCode);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IntlFlightOtaItemDetail"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/intl-flight/v1/items/" + com.aliyun.openapiutil.Client.getEncodeParam(otaItemId) + "/action/ota-get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IntlFlightOtaItemDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票报价商品详情</p>
     * 
     * @param request IntlFlightOtaItemDetailRequest
     * @return IntlFlightOtaItemDetailResponse
     */
    public IntlFlightOtaItemDetailResponse intlFlightOtaItemDetail(String otaItemId, IntlFlightOtaItemDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IntlFlightOtaItemDetailHeaders headers = new IntlFlightOtaItemDetailHeaders();
        return this.intlFlightOtaItemDetailWithOptions(otaItemId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票航班报价查询</p>
     * 
     * @param tmpReq IntlFlightOtaSearchRequest
     * @param headers IntlFlightOtaSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IntlFlightOtaSearchResponse
     */
    public IntlFlightOtaSearchResponse intlFlightOtaSearchWithOptions(IntlFlightOtaSearchRequest tmpReq, IntlFlightOtaSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IntlFlightOtaSearchShrinkRequest request = new IntlFlightOtaSearchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchJourneys)) {
            request.searchJourneysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchJourneys, "search_journeys", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchPassengerList)) {
            request.searchPassengerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchPassengerList, "search_passenger_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            query.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinType)) {
            query.put("cabin_type", request.cabinType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directOnly)) {
            query.put("direct_only", request.directOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needShareFlight)) {
            query.put("need_share_flight", request.needShareFlight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchJourneysShrink)) {
            query.put("search_journeys", request.searchJourneysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPassengerListShrink)) {
            query.put("search_passenger_list", request.searchPassengerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierCode)) {
            query.put("supplier_code", request.supplierCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripType)) {
            query.put("trip_type", request.tripType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IntlFlightOtaSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/intl-flight/v1/flights/action/ota-search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IntlFlightOtaSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票航班报价查询</p>
     * 
     * @param request IntlFlightOtaSearchRequest
     * @return IntlFlightOtaSearchResponse
     */
    public IntlFlightOtaSearchResponse intlFlightOtaSearch(IntlFlightOtaSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IntlFlightOtaSearchHeaders headers = new IntlFlightOtaSearchHeaders();
        return this.intlFlightOtaSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票航班可用证件查询</p>
     * 
     * @param request IntlFlightSegmentAvailableCertRequest
     * @param headers IntlFlightSegmentAvailableCertHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IntlFlightSegmentAvailableCertResponse
     */
    public IntlFlightSegmentAvailableCertResponse intlFlightSegmentAvailableCertWithOptions(String otaItemId, IntlFlightSegmentAvailableCertRequest request, IntlFlightSegmentAvailableCertHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isvName)) {
            query.put("isv_name", request.isvName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("user_name", request.userName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IntlFlightSegmentAvailableCert"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/intl-flight/v1/items/" + com.aliyun.openapiutil.Client.getEncodeParam(otaItemId) + "/action/segment-available-cert"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IntlFlightSegmentAvailableCertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际机票航班可用证件查询</p>
     * 
     * @param request IntlFlightSegmentAvailableCertRequest
     * @return IntlFlightSegmentAvailableCertResponse
     */
    public IntlFlightSegmentAvailableCertResponse intlFlightSegmentAvailableCert(String otaItemId, IntlFlightSegmentAvailableCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IntlFlightSegmentAvailableCertHeaders headers = new IntlFlightSegmentAvailableCertHeaders();
        return this.intlFlightSegmentAvailableCertWithOptions(otaItemId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增发票配置</p>
     * 
     * @param request InvoiceAddRequest
     * @param headers InvoiceAddHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvoiceAddResponse
     */
    public InvoiceAddResponse invoiceAddWithOptions(InvoiceAddRequest request, InvoiceAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bankName)) {
            body.put("bank_name", request.bankName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bankNo)) {
            body.put("bank_no", request.bankNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taxNo)) {
            body.put("tax_no", request.taxNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tel)) {
            body.put("tel", request.tel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unitType)) {
            body.put("unit_type", request.unitType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/add-invoice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceAddResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增发票配置</p>
     * 
     * @param request InvoiceAddRequest
     * @return InvoiceAddResponse
     */
    public InvoiceAddResponse invoiceAdd(InvoiceAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceAddHeaders headers = new InvoiceAddHeaders();
        return this.invoiceAddWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除发票抬头</p>
     * 
     * @param request InvoiceDeleteRequest
     * @param headers InvoiceDeleteHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvoiceDeleteResponse
     */
    public InvoiceDeleteResponse invoiceDeleteWithOptions(InvoiceDeleteRequest request, InvoiceDeleteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            query.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceDelete"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除发票抬头</p>
     * 
     * @param request InvoiceDeleteRequest
     * @return InvoiceDeleteResponse
     */
    public InvoiceDeleteResponse invoiceDelete(InvoiceDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceDeleteHeaders headers = new InvoiceDeleteHeaders();
        return this.invoiceDeleteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改发票配置</p>
     * 
     * @param request InvoiceModifyRequest
     * @param headers InvoiceModifyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvoiceModifyResponse
     */
    public InvoiceModifyResponse invoiceModifyWithOptions(InvoiceModifyRequest request, InvoiceModifyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bankName)) {
            body.put("bank_name", request.bankName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bankNo)) {
            body.put("bank_no", request.bankNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taxNo)) {
            body.put("tax_no", request.taxNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tel)) {
            body.put("tel", request.tel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unitType)) {
            body.put("unit_type", request.unitType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceModify"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceModifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改发票配置</p>
     * 
     * @param request InvoiceModifyRequest
     * @return InvoiceModifyResponse
     */
    public InvoiceModifyResponse invoiceModify(InvoiceModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceModifyHeaders headers = new InvoiceModifyHeaders();
        return this.invoiceModifyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增发票抬头可用员工</p>
     * 
     * @param tmpReq InvoiceRuleAddRequest
     * @param headers InvoiceRuleAddHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvoiceRuleAddResponse
     */
    public InvoiceRuleAddResponse invoiceRuleAddWithOptions(InvoiceRuleAddRequest tmpReq, InvoiceRuleAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InvoiceRuleAddShrinkRequest request = new InvoiceRuleAddShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entities)) {
            request.entitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entities, "entities", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entitiesShrink)) {
            body.put("entities", request.entitiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceRuleAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice-rule"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceRuleAddResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增发票抬头可用员工</p>
     * 
     * @param request InvoiceRuleAddRequest
     * @return InvoiceRuleAddResponse
     */
    public InvoiceRuleAddResponse invoiceRuleAdd(InvoiceRuleAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceRuleAddHeaders headers = new InvoiceRuleAddHeaders();
        return this.invoiceRuleAddWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除发票抬头可用员工</p>
     * 
     * @param tmpReq InvoiceRuleDeleteRequest
     * @param headers InvoiceRuleDeleteHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvoiceRuleDeleteResponse
     */
    public InvoiceRuleDeleteResponse invoiceRuleDeleteWithOptions(InvoiceRuleDeleteRequest tmpReq, InvoiceRuleDeleteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InvoiceRuleDeleteShrinkRequest request = new InvoiceRuleDeleteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entities)) {
            request.entitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entities, "entities", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delAll)) {
            query.put("del_all", request.delAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entitiesShrink)) {
            query.put("entities", request.entitiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            query.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceRuleDelete"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice-rule"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceRuleDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除发票抬头可用员工</p>
     * 
     * @param request InvoiceRuleDeleteRequest
     * @return InvoiceRuleDeleteResponse
     */
    public InvoiceRuleDeleteResponse invoiceRuleDelete(InvoiceRuleDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceRuleDeleteHeaders headers = new InvoiceRuleDeleteHeaders();
        return this.invoiceRuleDeleteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存发票规则</p>
     * 
     * @param tmpReq InvoiceRuleSaveRequest
     * @param headers InvoiceRuleSaveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvoiceRuleSaveResponse
     */
    public InvoiceRuleSaveResponse invoiceRuleSaveWithOptions(InvoiceRuleSaveRequest tmpReq, InvoiceRuleSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InvoiceRuleSaveShrinkRequest request = new InvoiceRuleSaveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entities)) {
            request.entitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entities, "entities", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allEmploye)) {
            body.put("all_employe", request.allEmploye);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entitiesShrink)) {
            body.put("entities", request.entitiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceRuleSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice-rule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceRuleSaveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存发票规则</p>
     * 
     * @param request InvoiceRuleSaveRequest
     * @return InvoiceRuleSaveResponse
     */
    public InvoiceRuleSaveResponse invoiceRuleSave(InvoiceRuleSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceRuleSaveHeaders headers = new InvoiceRuleSaveHeaders();
        return this.invoiceRuleSaveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>搜索用户可用发票抬头</p>
     * 
     * @param request InvoiceSearchRequest
     * @param headers InvoiceSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvoiceSearchResponse
     */
    public InvoiceSearchResponse invoiceSearchWithOptions(InvoiceSearchRequest request, InvoiceSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            query.put("third_part_id", request.thirdPartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>搜索用户可用发票抬头</p>
     * 
     * @param request InvoiceSearchRequest
     * @return InvoiceSearchResponse
     */
    public InvoiceSearchResponse invoiceSearch(InvoiceSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceSearchHeaders headers = new InvoiceSearchHeaders();
        return this.invoiceSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>员工特殊角色修改</p>
     * 
     * @param tmpReq IsvRuleSaveRequest
     * @param headers IsvRuleSaveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IsvRuleSaveResponse
     */
    public IsvRuleSaveResponse isvRuleSaveWithOptions(IsvRuleSaveRequest tmpReq, IsvRuleSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IsvRuleSaveShrinkRequest request = new IsvRuleSaveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bookuserList)) {
            request.bookuserListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bookuserList, "bookuser_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyNeed)) {
            body.put("apply_need", request.applyNeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bookType)) {
            body.put("book_type", request.bookType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bookuserListShrink)) {
            body.put("bookuser_list", request.bookuserListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleNeed)) {
            body.put("rule_need", request.ruleNeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsvRuleSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/v1/rule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsvRuleSaveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>员工特殊角色修改</p>
     * 
     * @param request IsvRuleSaveRequest
     * @return IsvRuleSaveResponse
     */
    public IsvRuleSaveResponse isvRuleSave(IsvRuleSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IsvRuleSaveHeaders headers = new IsvRuleSaveHeaders();
        return this.isvRuleSaveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用户同步</p>
     * 
     * @param tmpReq IsvUserSaveRequest
     * @param headers IsvUserSaveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IsvUserSaveResponse
     */
    public IsvUserSaveResponse isvUserSaveWithOptions(IsvUserSaveRequest tmpReq, IsvUserSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IsvUserSaveShrinkRequest request = new IsvUserSaveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userList)) {
            request.userListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userList, "user_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userListShrink)) {
            body.put("user_list", request.userListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsvUserSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/isvuser/v1/isvuser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsvUserSaveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>用户同步</p>
     * 
     * @param request IsvUserSaveRequest
     * @return IsvUserSaveResponse
     */
    public IsvUserSaveResponse isvUserSave(IsvUserSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IsvUserSaveHeaders headers = new IsvUserSaveHeaders();
        return this.isvUserSaveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询因公用餐记账数据</p>
     * 
     * @param request MealBillSettlementQueryRequest
     * @param headers MealBillSettlementQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return MealBillSettlementQueryResponse
     */
    public MealBillSettlementQueryResponse mealBillSettlementQueryWithOptions(MealBillSettlementQueryRequest request, MealBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MealBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/meal/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MealBillSettlementQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询因公用餐记账数据</p>
     * 
     * @param request MealBillSettlementQueryRequest
     * @return MealBillSettlementQueryResponse
     */
    public MealBillSettlementQueryResponse mealBillSettlementQuery(MealBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MealBillSettlementQueryHeaders headers = new MealBillSettlementQueryHeaders();
        return this.mealBillSettlementQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用餐订单详情</p>
     * 
     * @param request MealOrderDetailQueryRequest
     * @param headers MealOrderDetailQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return MealOrderDetailQueryResponse
     */
    public MealOrderDetailQueryResponse mealOrderDetailQueryWithOptions(String orderId, MealOrderDetailQueryRequest request, MealOrderDetailQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MealOrderDetailQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/meal/v1/orders/" + com.aliyun.openapiutil.Client.getEncodeParam(orderId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MealOrderDetailQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用餐订单详情</p>
     * 
     * @param request MealOrderDetailQueryRequest
     * @return MealOrderDetailQueryResponse
     */
    public MealOrderDetailQueryResponse mealOrderDetailQuery(String orderId, MealOrderDetailQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MealOrderDetailQueryHeaders headers = new MealOrderDetailQueryHeaders();
        return this.mealOrderDetailQueryWithOptions(orderId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用餐订单列表</p>
     * 
     * @param request MealOrderListQueryRequest
     * @param headers MealOrderListQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return MealOrderListQueryResponse
     */
    public MealOrderListQueryResponse mealOrderListQueryWithOptions(MealOrderListQueryRequest request, MealOrderListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MealOrderListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/meal/v1/orders"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MealOrderListQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用餐订单列表</p>
     * 
     * @param request MealOrderListQueryRequest
     * @return MealOrderListQueryResponse
     */
    public MealOrderListQueryResponse mealOrderListQuery(MealOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MealOrderListQueryHeaders headers = new MealOrderListQueryHeaders();
        return this.mealOrderListQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>月账单确认</p>
     * 
     * @param request MonthBillConfirmRequest
     * @param headers MonthBillConfirmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return MonthBillConfirmResponse
     */
    public MonthBillConfirmResponse monthBillConfirmWithOptions(MonthBillConfirmRequest request, MonthBillConfirmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mailBillDate)) {
            body.put("mail_bill_date", request.mailBillDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MonthBillConfirm"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bill/v1/status/action/confirm"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MonthBillConfirmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>月账单确认</p>
     * 
     * @param request MonthBillConfirmRequest
     * @return MonthBillConfirmResponse
     */
    public MonthBillConfirmResponse monthBillConfirm(MonthBillConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MonthBillConfirmHeaders headers = new MonthBillConfirmHeaders();
        return this.monthBillConfirmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询企业月账单</p>
     * 
     * @param request MonthBillGetRequest
     * @param headers MonthBillGetHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return MonthBillGetResponse
     */
    public MonthBillGetResponse monthBillGetWithOptions(MonthBillGetRequest request, MonthBillGetHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billMonth)) {
            query.put("bill_month", request.billMonth);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MonthBillGet"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/v1/month-bill"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MonthBillGetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询企业月账单</p>
     * 
     * @param request MonthBillGetRequest
     * @return MonthBillGetResponse
     */
    public MonthBillGetResponse monthBillGet(MonthBillGetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MonthBillGetHeaders headers = new MonthBillGetHeaders();
        return this.monthBillGetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加项目</p>
     * 
     * @param request ProjectAddRequest
     * @param headers ProjectAddHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProjectAddResponse
     */
    public ProjectAddResponse projectAddWithOptions(ProjectAddRequest request, ProjectAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("project_name", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartCostCenterId)) {
            body.put("third_part_cost_center_id", request.thirdPartCostCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartInvoiceId)) {
            body.put("third_part_invoice_id", request.thirdPartInvoiceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cost/v1/project"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectAddResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加项目</p>
     * 
     * @param request ProjectAddRequest
     * @return ProjectAddResponse
     */
    public ProjectAddResponse projectAdd(ProjectAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ProjectAddHeaders headers = new ProjectAddHeaders();
        return this.projectAddWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request ProjectDeleteRequest
     * @param headers ProjectDeleteHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProjectDeleteResponse
     */
    public ProjectDeleteResponse projectDeleteWithOptions(ProjectDeleteRequest request, ProjectDeleteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            query.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectDelete"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cost/v1/project"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request ProjectDeleteRequest
     * @return ProjectDeleteResponse
     */
    public ProjectDeleteResponse projectDelete(ProjectDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ProjectDeleteHeaders headers = new ProjectDeleteHeaders();
        return this.projectDeleteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更项目</p>
     * 
     * @param request ProjectModifyRequest
     * @param headers ProjectModifyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProjectModifyResponse
     */
    public ProjectModifyResponse projectModifyWithOptions(ProjectModifyRequest request, ProjectModifyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("project_name", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartCostCenterId)) {
            body.put("third_part_cost_center_id", request.thirdPartCostCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartInvoiceId)) {
            body.put("third_part_invoice_id", request.thirdPartInvoiceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectModify"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cost/v1/project"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectModifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更项目</p>
     * 
     * @param request ProjectModifyRequest
     * @return ProjectModifyResponse
     */
    public ProjectModifyResponse projectModify(ProjectModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ProjectModifyHeaders headers = new ProjectModifyHeaders();
        return this.projectModifyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询子企业列表</p>
     * 
     * @param request QueryGroupCorpListRequest
     * @param headers QueryGroupCorpListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGroupCorpListResponse
     */
    public QueryGroupCorpListResponse queryGroupCorpListWithOptions(QueryGroupCorpListRequest request, QueryGroupCorpListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGroupCorpList"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sub_corps/v1/corps/action/corpList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGroupCorpListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询子企业列表</p>
     * 
     * @param request QueryGroupCorpListRequest
     * @return QueryGroupCorpListResponse
     */
    public QueryGroupCorpListResponse queryGroupCorpList(QueryGroupCorpListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryGroupCorpListHeaders headers = new QueryGroupCorpListHeaders();
        return this.queryGroupCorpListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>报销单查询</p>
     * 
     * @param request QueryReimbursementOrderRequest
     * @param headers QueryReimbursementOrderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryReimbursementOrderResponse
     */
    public QueryReimbursementOrderResponse queryReimbursementOrderWithOptions(QueryReimbursementOrderRequest request, QueryReimbursementOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reimbOrderNo)) {
            query.put("reimb_order_no", request.reimbOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            query.put("sub_corp_id", request.subCorpId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryReimbursementOrder"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/reimbursement/v1/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryReimbursementOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>报销单查询</p>
     * 
     * @param request QueryReimbursementOrderRequest
     * @return QueryReimbursementOrderResponse
     */
    public QueryReimbursementOrderResponse queryReimbursementOrder(QueryReimbursementOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryReimbursementOrderHeaders headers = new QueryReimbursementOrderHeaders();
        return this.queryReimbursementOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>单个人员同步</p>
     * 
     * @param tmpReq SyncSingleUserRequest
     * @param headers SyncSingleUserHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncSingleUserResponse
     */
    public SyncSingleUserResponse syncSingleUserWithOptions(SyncSingleUserRequest tmpReq, SyncSingleUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncSingleUserShrinkRequest request = new SyncSingleUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.thirdDepartIdList)) {
            request.thirdDepartIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.thirdDepartIdList, "third_depart_id_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobNo)) {
            body.put("job_no", request.jobNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leaveStatus)) {
            body.put("leave_status", request.leaveStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerUserId)) {
            body.put("manager_user_id", request.managerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            body.put("position", request.position);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.positionLevel)) {
            body.put("position_level", request.positionLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realNameEn)) {
            body.put("real_name_en", request.realNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdDepartIdListShrink)) {
            body.put("third_depart_id_list", request.thirdDepartIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("user_name", request.userName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncSingleUser"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/v1/single-user/action/sync"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncSingleUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>单个人员同步</p>
     * 
     * @param request SyncSingleUserRequest
     * @return SyncSingleUserResponse
     */
    public SyncSingleUserResponse syncSingleUser(SyncSingleUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SyncSingleUserHeaders headers = new SyncSingleUserHeaders();
        return this.syncSingleUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步三方用户映射关系</p>
     * 
     * @param request SyncThirdUserMappingRequest
     * @param headers SyncThirdUserMappingHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncThirdUserMappingResponse
     */
    public SyncThirdUserMappingResponse syncThirdUserMappingWithOptions(SyncThirdUserMappingRequest request, SyncThirdUserMappingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdChannelType)) {
            body.put("third_channel_type", request.thirdChannelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdUserId)) {
            body.put("third_user_id", request.thirdUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncThirdUserMapping"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/v1/third-users/action/mapping"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncThirdUserMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步三方用户映射关系</p>
     * 
     * @param request SyncThirdUserMappingRequest
     * @return SyncThirdUserMappingResponse
     */
    public SyncThirdUserMappingResponse syncThirdUserMapping(SyncThirdUserMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SyncThirdUserMappingHeaders headers = new SyncThirdUserMappingHeaders();
        return this.syncThirdUserMappingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询淘宝账号信息</p>
     * 
     * @param headers TBAccountInfoQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TBAccountInfoQueryResponse
     */
    public TBAccountInfoQueryResponse tBAccountInfoQueryWithOptions(String userId, TBAccountInfoQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TBAccountInfoQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/account/v1/tb-accounts/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TBAccountInfoQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询淘宝账号信息</p>
     * @return TBAccountInfoQueryResponse
     */
    public TBAccountInfoQueryResponse tBAccountInfoQuery(String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TBAccountInfoQueryHeaders headers = new TBAccountInfoQueryHeaders();
        return this.tBAccountInfoQueryWithOptions(userId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑淘宝账号</p>
     * 
     * @param headers TBAccountUnbindHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TBAccountUnbindResponse
     */
    public TBAccountUnbindResponse tBAccountUnbindWithOptions(String userId, TBAccountUnbindHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TBAccountUnbind"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/account/v1/tb-accounts/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + "/action/unbind"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TBAccountUnbindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑淘宝账号</p>
     * @return TBAccountUnbindResponse
     */
    public TBAccountUnbindResponse tBAccountUnbind(String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TBAccountUnbindHeaders headers = new TBAccountUnbindHeaders();
        return this.tBAccountUnbindWithOptions(userId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签申请</p>
     * 
     * @param tmpReq TicketChangingApplyRequest
     * @param headers TicketChangingApplyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TicketChangingApplyResponse
     */
    public TicketChangingApplyResponse ticketChangingApplyWithOptions(TicketChangingApplyRequest tmpReq, TicketChangingApplyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TicketChangingApplyShrinkRequest request = new TicketChangingApplyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.modifyFlightInfoList)) {
            request.modifyFlightInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.modifyFlightInfoList, "modify_flight_info_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            body.put("dis_sub_order_id", request.disSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isVoluntary)) {
            body.put("is_voluntary", request.isVoluntary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyFlightInfoListShrink)) {
            body.put("modify_flight_info_list", request.modifyFlightInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaItemId)) {
            body.put("ota_item_id", request.otaItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("session_id", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whetherRetry)) {
            body.put("whether_retry", request.whetherRetry);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingApply"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/ticket-changing/action/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingApplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签申请</p>
     * 
     * @param request TicketChangingApplyRequest
     * @return TicketChangingApplyResponse
     */
    public TicketChangingApplyResponse ticketChangingApply(TicketChangingApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingApplyHeaders headers = new TicketChangingApplyHeaders();
        return this.ticketChangingApplyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签取消</p>
     * 
     * @param request TicketChangingCancelRequest
     * @param headers TicketChangingCancelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TicketChangingCancelResponse
     */
    public TicketChangingCancelResponse ticketChangingCancelWithOptions(TicketChangingCancelRequest request, TicketChangingCancelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            query.put("dis_sub_order_id", request.disSubOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingCancel"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/ticket-changing/action/cancel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingCancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签取消</p>
     * 
     * @param request TicketChangingCancelRequest
     * @return TicketChangingCancelResponse
     */
    public TicketChangingCancelResponse ticketChangingCancel(TicketChangingCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingCancelHeaders headers = new TicketChangingCancelHeaders();
        return this.ticketChangingCancelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签详情</p>
     * 
     * @param request TicketChangingDetailRequest
     * @param headers TicketChangingDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TicketChangingDetailResponse
     */
    public TicketChangingDetailResponse ticketChangingDetailWithOptions(TicketChangingDetailRequest request, TicketChangingDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            query.put("dis_sub_order_id", request.disSubOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingDetail"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/ticket-changing/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签详情</p>
     * 
     * @param request TicketChangingDetailRequest
     * @return TicketChangingDetailResponse
     */
    public TicketChangingDetailResponse ticketChangingDetail(TicketChangingDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingDetailHeaders headers = new TicketChangingDetailHeaders();
        return this.ticketChangingDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签询价</p>
     * 
     * @param request TicketChangingEnquiryRequest
     * @param headers TicketChangingEnquiryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TicketChangingEnquiryResponse
     */
    public TicketChangingEnquiryResponse ticketChangingEnquiryWithOptions(TicketChangingEnquiryRequest request, TicketChangingEnquiryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrCity)) {
            query.put("arr_city", request.arrCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCity)) {
            query.put("dep_city", request.depCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isVoluntary)) {
            query.put("is_voluntary", request.isVoluntary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyDepartDate)) {
            query.put("modify_depart_date", request.modifyDepartDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyFlightNo)) {
            query.put("modify_flight_no", request.modifyFlightNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("session_id", request.sessionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingEnquiry"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/ticket-changing/action/enquiry"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingEnquiryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签询价</p>
     * 
     * @param request TicketChangingEnquiryRequest
     * @return TicketChangingEnquiryResponse
     */
    public TicketChangingEnquiryResponse ticketChangingEnquiry(TicketChangingEnquiryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingEnquiryHeaders headers = new TicketChangingEnquiryHeaders();
        return this.ticketChangingEnquiryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签可改签航班列表</p>
     * 
     * @param tmpReq TicketChangingFlightListRequest
     * @param headers TicketChangingFlightListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TicketChangingFlightListResponse
     */
    public TicketChangingFlightListResponse ticketChangingFlightListWithOptions(TicketChangingFlightListRequest tmpReq, TicketChangingFlightListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TicketChangingFlightListShrinkRequest request = new TicketChangingFlightListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerInfoList)) {
            request.travelerInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerInfoList, "traveler_info_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrCity)) {
            query.put("arr_city", request.arrCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCity)) {
            query.put("dep_city", request.depCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            query.put("dep_date", request.depDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isVoluntary)) {
            query.put("is_voluntary", request.isVoluntary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerInfoListShrink)) {
            query.put("traveler_info_list", request.travelerInfoListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingFlightList"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/huge/dtb-flight/v1/ticket-changing-flight/action/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingFlightListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签可改签航班列表</p>
     * 
     * @param request TicketChangingFlightListRequest
     * @return TicketChangingFlightListResponse
     */
    public TicketChangingFlightListResponse ticketChangingFlightList(TicketChangingFlightListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingFlightListHeaders headers = new TicketChangingFlightListHeaders();
        return this.ticketChangingFlightListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签航班支付</p>
     * 
     * @param tmpReq TicketChangingPayRequest
     * @param headers TicketChangingPayHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TicketChangingPayResponse
     */
    public TicketChangingPayResponse ticketChangingPayWithOptions(TicketChangingPayRequest tmpReq, TicketChangingPayHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TicketChangingPayShrinkRequest request = new TicketChangingPayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "extra", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpPayPrice)) {
            body.put("corp_pay_price", request.corpPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            body.put("dis_sub_order_id", request.disSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            body.put("extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalPayPrice)) {
            body.put("personal_pay_price", request.personalPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalPayPrice)) {
            body.put("total_pay_price", request.totalPayPrice);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingPay"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/ticket-changing/action/pay"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingPayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>机票改签航班支付</p>
     * 
     * @param request TicketChangingPayRequest
     * @return TicketChangingPayResponse
     */
    public TicketChangingPayResponse ticketChangingPay(TicketChangingPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingPayHeaders headers = new TicketChangingPayHeaders();
        return this.ticketChangingPayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票改签申请</p>
     * 
     * @param tmpReq TrainApplyChangeRequest
     * @param headers TrainApplyChangeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainApplyChangeResponse
     */
    public TrainApplyChangeResponse trainApplyChangeWithOptions(TrainApplyChangeRequest tmpReq, TrainApplyChangeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TrainApplyChangeShrinkRequest request = new TrainApplyChangeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.changeTrainInfoS)) {
            request.changeTrainInfoSShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.changeTrainInfoS, "change_train_info_s", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeTrainInfoSShrink)) {
            query.put("change_train_info_s", request.changeTrainInfoSShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptNoSeat)) {
            body.put("accept_no_seat", request.acceptNoSeat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceMatch)) {
            body.put("force_match", request.forceMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPayNow)) {
            body.put("is_pay_now", request.isPayNow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outChangeApplyId)) {
            body.put("out_change_apply_id", request.outChangeApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainApplyChange"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/change/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainApplyChangeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票改签申请</p>
     * 
     * @param request TrainApplyChangeRequest
     * @return TrainApplyChangeResponse
     */
    public TrainApplyChangeResponse trainApplyChange(TrainApplyChangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainApplyChangeHeaders headers = new TrainApplyChangeHeaders();
        return this.trainApplyChangeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票退票申请</p>
     * 
     * @param tmpReq TrainApplyRefundRequest
     * @param headers TrainApplyRefundHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainApplyRefundResponse
     */
    public TrainApplyRefundResponse trainApplyRefundWithOptions(TrainApplyRefundRequest tmpReq, TrainApplyRefundHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TrainApplyRefundShrinkRequest request = new TrainApplyRefundShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.refundTrainInfos)) {
            request.refundTrainInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.refundTrainInfos, "refund_train_infos", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outRefundId)) {
            body.put("out_refund_id", request.outRefundId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundTrainInfosShrink)) {
            body.put("refund_train_infos", request.refundTrainInfosShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainApplyRefund"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/refund/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainApplyRefundResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票退票申请</p>
     * 
     * @param request TrainApplyRefundRequest
     * @return TrainApplyRefundResponse
     */
    public TrainApplyRefundResponse trainApplyRefund(TrainApplyRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainApplyRefundHeaders headers = new TrainApplyRefundHeaders();
        return this.trainApplyRefundWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车票记账数据</p>
     * 
     * @param request TrainBillSettlementQueryRequest
     * @param headers TrainBillSettlementQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainBillSettlementQueryResponse
     */
    public TrainBillSettlementQueryResponse trainBillSettlementQueryWithOptions(TrainBillSettlementQueryRequest request, TrainBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainBillSettlementQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车票记账数据</p>
     * 
     * @param request TrainBillSettlementQueryRequest
     * @return TrainBillSettlementQueryResponse
     */
    public TrainBillSettlementQueryResponse trainBillSettlementQuery(TrainBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainBillSettlementQueryHeaders headers = new TrainBillSettlementQueryHeaders();
        return this.trainBillSettlementQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车超标审批详情</p>
     * 
     * @param request TrainExceedApplyQueryRequest
     * @param headers TrainExceedApplyQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainExceedApplyQueryResponse
     */
    public TrainExceedApplyQueryResponse trainExceedApplyQueryWithOptions(TrainExceedApplyQueryRequest request, TrainExceedApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInstanceId)) {
            query.put("business_instance_id", request.businessInstanceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainExceedApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/train-exceed"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainExceedApplyQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车超标审批详情</p>
     * 
     * @param request TrainExceedApplyQueryRequest
     * @return TrainExceedApplyQueryResponse
     */
    public TrainExceedApplyQueryResponse trainExceedApplyQuery(TrainExceedApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainExceedApplyQueryHeaders headers = new TrainExceedApplyQueryHeaders();
        return this.trainExceedApplyQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票改签费用预估</p>
     * 
     * @param tmpReq TrainFeeCalculateChangeRequest
     * @param headers TrainFeeCalculateChangeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainFeeCalculateChangeResponse
     */
    public TrainFeeCalculateChangeResponse trainFeeCalculateChangeWithOptions(TrainFeeCalculateChangeRequest tmpReq, TrainFeeCalculateChangeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TrainFeeCalculateChangeShrinkRequest request = new TrainFeeCalculateChangeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.changeTrainDetails)) {
            request.changeTrainDetailsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.changeTrainDetails, "change_train_details", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeTrainDetailsShrink)) {
            body.put("change_train_details", request.changeTrainDetailsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributeOrderId)) {
            body.put("distribute_order_id", request.distributeOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainFeeCalculateChange"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/change/fee"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainFeeCalculateChangeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票改签费用预估</p>
     * 
     * @param request TrainFeeCalculateChangeRequest
     * @return TrainFeeCalculateChangeResponse
     */
    public TrainFeeCalculateChangeResponse trainFeeCalculateChange(TrainFeeCalculateChangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainFeeCalculateChangeHeaders headers = new TrainFeeCalculateChangeHeaders();
        return this.trainFeeCalculateChangeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票退票费用预估</p>
     * 
     * @param tmpReq TrainFeeCalculateRefundRequest
     * @param headers TrainFeeCalculateRefundHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainFeeCalculateRefundResponse
     */
    public TrainFeeCalculateRefundResponse trainFeeCalculateRefundWithOptions(TrainFeeCalculateRefundRequest tmpReq, TrainFeeCalculateRefundHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TrainFeeCalculateRefundShrinkRequest request = new TrainFeeCalculateRefundShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.refundTrainInfos)) {
            request.refundTrainInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.refundTrainInfos, "refund_train_infos", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributeOrderId)) {
            body.put("distribute_order_id", request.distributeOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundTrainInfosShrink)) {
            body.put("refund_train_infos", request.refundTrainInfosShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainFeeCalculateRefund"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/refund/fee"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainFeeCalculateRefundResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票退票费用预估</p>
     * 
     * @param request TrainFeeCalculateRefundRequest
     * @return TrainFeeCalculateRefundResponse
     */
    public TrainFeeCalculateRefundResponse trainFeeCalculateRefund(TrainFeeCalculateRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainFeeCalculateRefundHeaders headers = new TrainFeeCalculateRefundHeaders();
        return this.trainFeeCalculateRefundWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票车次详情查询</p>
     * 
     * @param request TrainNoInfoSearchRequest
     * @param headers TrainNoInfoSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainNoInfoSearchResponse
     */
    public TrainNoInfoSearchResponse trainNoInfoSearchWithOptions(TrainNoInfoSearchRequest request, TrainNoInfoSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrLocation)) {
            body.put("arr_location", request.arrLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            body.put("dep_date", request.depDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depLocation)) {
            body.put("dep_location", request.depLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineKey)) {
            body.put("line_key", request.lineKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.middleDate)) {
            body.put("middle_date", request.middleDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.middleStation)) {
            body.put("middle_station", request.middleStation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainNo)) {
            body.put("train_no", request.trainNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainNoInfoSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/search/info"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainNoInfoSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票车次详情查询</p>
     * 
     * @param request TrainNoInfoSearchRequest
     * @return TrainNoInfoSearchResponse
     */
    public TrainNoInfoSearchResponse trainNoInfoSearch(TrainNoInfoSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainNoInfoSearchHeaders headers = new TrainNoInfoSearchHeaders();
        return this.trainNoInfoSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票车次列表查询</p>
     * 
     * @param tmpReq TrainNoListSearchRequest
     * @param headers TrainNoListSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainNoListSearchResponse
     */
    public TrainNoListSearchResponse trainNoListSearchWithOptions(TrainNoListSearchRequest tmpReq, TrainNoListSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TrainNoListSearchShrinkRequest request = new TrainNoListSearchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.option)) {
            request.optionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.option, "option", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrLocation)) {
            body.put("arr_location", request.arrLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            body.put("dep_date", request.depDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depLocation)) {
            body.put("dep_location", request.depLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionShrink)) {
            body.put("option", request.optionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainNoListSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/search/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainNoListSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票车次列表查询</p>
     * 
     * @param request TrainNoListSearchRequest
     * @return TrainNoListSearchResponse
     */
    public TrainNoListSearchResponse trainNoListSearch(TrainNoListSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainNoListSearchHeaders headers = new TrainNoListSearchHeaders();
        return this.trainNoListSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票订单取消</p>
     * 
     * @param request TrainOrderCancelRequest
     * @param headers TrainOrderCancelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainOrderCancelResponse
     */
    public TrainOrderCancelResponse trainOrderCancelWithOptions(TrainOrderCancelRequest request, TrainOrderCancelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            body.put("change_order_id", request.changeOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outChangeOrderId)) {
            body.put("out_change_order_id", request.outChangeOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainOrderCancel"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/order/cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainOrderCancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票订单取消</p>
     * 
     * @param request TrainOrderCancelRequest
     * @return TrainOrderCancelResponse
     */
    public TrainOrderCancelResponse trainOrderCancel(TrainOrderCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderCancelHeaders headers = new TrainOrderCancelHeaders();
        return this.trainOrderCancelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票改签确认</p>
     * 
     * @param request TrainOrderChangeConfirmRequest
     * @param headers TrainOrderChangeConfirmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainOrderChangeConfirmResponse
     */
    public TrainOrderChangeConfirmResponse trainOrderChangeConfirmWithOptions(TrainOrderChangeConfirmRequest request, TrainOrderChangeConfirmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeApplyId)) {
            body.put("change_apply_id", request.changeApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeSettleAmount)) {
            body.put("change_settle_amount", request.changeSettleAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outChangeApplyId)) {
            body.put("out_change_apply_id", request.outChangeApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainOrderChangeConfirm"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/change/confirm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainOrderChangeConfirmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票改签确认</p>
     * 
     * @param request TrainOrderChangeConfirmRequest
     * @return TrainOrderChangeConfirmResponse
     */
    public TrainOrderChangeConfirmResponse trainOrderChangeConfirm(TrainOrderChangeConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderChangeConfirmHeaders headers = new TrainOrderChangeConfirmHeaders();
        return this.trainOrderChangeConfirmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票正向预订</p>
     * 
     * @param tmpReq TrainOrderCreateRequest
     * @param headers TrainOrderCreateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainOrderCreateResponse
     */
    public TrainOrderCreateResponse trainOrderCreateWithOptions(TrainOrderCreateRequest tmpReq, TrainOrderCreateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TrainOrderCreateShrinkRequest request = new TrainOrderCreateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bookTrainInfos)) {
            request.bookTrainInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bookTrainInfos, "book_train_infos", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.businessInfo)) {
            request.businessInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.businessInfo, "business_info", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contactInfo)) {
            request.contactInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contactInfo, "contact_info", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerOpenInfoS)) {
            request.passengerOpenInfoSShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerOpenInfoS, "passenger_open_info_s", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptNoSeat)) {
            body.put("accept_no_seat", request.acceptNoSeat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bookTrainInfosShrink)) {
            body.put("book_train_infos", request.bookTrainInfosShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.btripUserName)) {
            body.put("btrip_user_name", request.btripUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInfoShrink)) {
            body.put("business_info", request.businessInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactInfoShrink)) {
            body.put("contact_info", request.contactInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceMatch)) {
            body.put("force_match", request.forceMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPayNow)) {
            body.put("is_pay_now", request.isPayNow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerOpenInfoSShrink)) {
            body.put("passenger_open_info_s", request.passengerOpenInfoSShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainOrderCreate"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/order/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainOrderCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票正向预订</p>
     * 
     * @param request TrainOrderCreateRequest
     * @return TrainOrderCreateResponse
     */
    public TrainOrderCreateResponse trainOrderCreate(TrainOrderCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderCreateHeaders headers = new TrainOrderCreateHeaders();
        return this.trainOrderCreateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票订单详情</p>
     * 
     * @param request TrainOrderDetailQueryRequest
     * @param headers TrainOrderDetailQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainOrderDetailQueryResponse
     */
    public TrainOrderDetailQueryResponse trainOrderDetailQueryWithOptions(TrainOrderDetailQueryRequest request, TrainOrderDetailQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainOrderDetailQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/order/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainOrderDetailQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票订单详情</p>
     * 
     * @param request TrainOrderDetailQueryRequest
     * @return TrainOrderDetailQueryResponse
     */
    public TrainOrderDetailQueryResponse trainOrderDetailQuery(TrainOrderDetailQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderDetailQueryHeaders headers = new TrainOrderDetailQueryHeaders();
        return this.trainOrderDetailQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车票订单列表</p>
     * 
     * @param request TrainOrderListQueryRequest
     * @param headers TrainOrderListQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainOrderListQueryResponse
     */
    public TrainOrderListQueryResponse trainOrderListQueryWithOptions(TrainOrderListQueryRequest request, TrainOrderListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allApply)) {
            query.put("all_apply", request.allApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            query.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            query.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            query.put("update_end_time", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStartTime)) {
            query.put("update_start_time", request.updateStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainOrderListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/order-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainOrderListQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车票订单列表</p>
     * 
     * @param request TrainOrderListQueryRequest
     * @return TrainOrderListQueryResponse
     */
    public TrainOrderListQueryResponse trainOrderListQuery(TrainOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderListQueryHeaders headers = new TrainOrderListQueryHeaders();
        return this.trainOrderListQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票订单支付</p>
     * 
     * @param request TrainOrderPayRequest
     * @param headers TrainOrderPayHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainOrderPayResponse
     */
    public TrainOrderPayResponse trainOrderPayWithOptions(TrainOrderPayRequest request, TrainOrderPayHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            body.put("out_order_id", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payAmount)) {
            body.put("pay_amount", request.payAmount);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainOrderPay"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/order/pay"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainOrderPayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票订单支付</p>
     * 
     * @param request TrainOrderPayRequest
     * @return TrainOrderPayResponse
     */
    public TrainOrderPayResponse trainOrderPay(TrainOrderPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderPayHeaders headers = new TrainOrderPayHeaders();
        return this.trainOrderPayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车票订单详情（含票信息）</p>
     * 
     * @param request TrainOrderQueryRequest
     * @param headers TrainOrderQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainOrderQueryResponse
     */
    public TrainOrderQueryResponse trainOrderQueryWithOptions(TrainOrderQueryRequest request, TrainOrderQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainOrderQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainOrderQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车票订单详情（含票信息）</p>
     * 
     * @param request TrainOrderQueryRequest
     * @return TrainOrderQueryResponse
     */
    public TrainOrderQueryResponse trainOrderQuery(TrainOrderQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderQueryHeaders headers = new TrainOrderQueryHeaders();
        return this.trainOrderQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票订单查询V2</p>
     * 
     * @param request TrainOrderQueryV2Request
     * @param headers TrainOrderQueryV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainOrderQueryV2Response
     */
    public TrainOrderQueryV2Response trainOrderQueryV2WithOptions(TrainOrderQueryV2Request request, TrainOrderQueryV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainOrderQueryV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v2/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainOrderQueryV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票订单查询V2</p>
     * 
     * @param request TrainOrderQueryV2Request
     * @return TrainOrderQueryV2Response
     */
    public TrainOrderQueryV2Response trainOrderQueryV2(TrainOrderQueryV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderQueryV2Headers headers = new TrainOrderQueryV2Headers();
        return this.trainOrderQueryV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车站数据</p>
     * 
     * @param request TrainStationSearchRequest
     * @param headers TrainStationSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainStationSearchResponse
     */
    public TrainStationSearchResponse trainStationSearchWithOptions(TrainStationSearchRequest request, TrainStationSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainStationSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/city/v1/train"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainStationSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车站数据</p>
     * 
     * @param request TrainStationSearchRequest
     * @return TrainStationSearchResponse
     */
    public TrainStationSearchResponse trainStationSearch(TrainStationSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainStationSearchHeaders headers = new TrainStationSearchHeaders();
        return this.trainStationSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票经停站查询</p>
     * 
     * @param request TrainStopoverSearchRequest
     * @param headers TrainStopoverSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainStopoverSearchResponse
     */
    public TrainStopoverSearchResponse trainStopoverSearchWithOptions(TrainStopoverSearchRequest request, TrainStopoverSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrStation)) {
            body.put("arr_station", request.arrStation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depStation)) {
            body.put("dep_station", request.depStation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainDate)) {
            body.put("train_date", request.trainDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainNo)) {
            body.put("train_no", request.trainNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainStopoverSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/search/stopover"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainStopoverSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>火车票经停站查询</p>
     * 
     * @param request TrainStopoverSearchRequest
     * @return TrainStopoverSearchResponse
     */
    public TrainStopoverSearchResponse trainStopoverSearch(TrainStopoverSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainStopoverSearchHeaders headers = new TrainStopoverSearchHeaders();
        return this.trainStopoverSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车票凭证扫描件</p>
     * 
     * @param request TrainTicketScanQueryRequest
     * @param headers TrainTicketScanQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrainTicketScanQueryResponse
     */
    public TrainTicketScanQueryResponse trainTicketScanQueryWithOptions(TrainTicketScanQueryRequest request, TrainTicketScanQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            query.put("bill_date", request.billDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            query.put("bill_id", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceSubTaskId)) {
            query.put("invoice_sub_task_id", request.invoiceSubTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("serial_number", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketNo)) {
            query.put("ticket_no", request.ticketNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainTicketScanQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scan/v1/train-ticket"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainTicketScanQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询火车票凭证扫描件</p>
     * 
     * @param request TrainTicketScanQueryRequest
     * @return TrainTicketScanQueryResponse
     */
    public TrainTicketScanQueryResponse trainTicketScanQuery(TrainTicketScanQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainTicketScanQueryHeaders headers = new TrainTicketScanQueryHeaders();
        return this.trainTicketScanQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询差标列表</p>
     * 
     * @param request TravelStandardListQueryRequest
     * @param headers TravelStandardListQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TravelStandardListQueryResponse
     */
    public TravelStandardListQueryResponse travelStandardListQueryWithOptions(TravelStandardListQueryRequest request, TravelStandardListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromGroup)) {
            query.put("from_group", request.fromGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("rule_name", request.ruleName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TravelStandardListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/travel-manage/v1/standards/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TravelStandardListQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询差标列表</p>
     * 
     * @param request TravelStandardListQueryRequest
     * @return TravelStandardListQueryResponse
     */
    public TravelStandardListQueryResponse travelStandardListQuery(TravelStandardListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TravelStandardListQueryHeaders headers = new TravelStandardListQueryHeaders();
        return this.travelStandardListQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询差标详情</p>
     * 
     * @param tmpReq TravelStandardQueryRequest
     * @param headers TravelStandardQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TravelStandardQueryResponse
     */
    public TravelStandardQueryResponse travelStandardQueryWithOptions(TravelStandardQueryRequest tmpReq, TravelStandardQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TravelStandardQueryShrinkRequest request = new TravelStandardQueryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serviceTypeList)) {
            request.serviceTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serviceTypeList, "service_type_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromGroup)) {
            query.put("from_group", request.fromGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleCode)) {
            query.put("rule_code", request.ruleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceTypeListShrink)) {
            query.put("service_type_list", request.serviceTypeListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TravelStandardQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/travel-manage/v1/standards/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TravelStandardQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询差标详情</p>
     * 
     * @param request TravelStandardQueryRequest
     * @return TravelStandardQueryResponse
     */
    public TravelStandardQueryResponse travelStandardQuery(TravelStandardQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TravelStandardQueryHeaders headers = new TravelStandardQueryHeaders();
        return this.travelStandardQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询业务流程</p>
     * 
     * @param request TripBusinessInstanceQueryRequest
     * @param headers TripBusinessInstanceQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TripBusinessInstanceQueryResponse
     */
    public TripBusinessInstanceQueryResponse tripBusinessInstanceQueryWithOptions(TripBusinessInstanceQueryRequest request, TripBusinessInstanceQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessInstanceId)) {
            query.put("business_instance_id", request.businessInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdBusinessId)) {
            query.put("third_business_id", request.thirdBusinessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("user_name", request.userName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TripBusinessInstanceQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/business"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TripBusinessInstanceQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询业务流程</p>
     * 
     * @param request TripBusinessInstanceQueryRequest
     * @return TripBusinessInstanceQueryResponse
     */
    public TripBusinessInstanceQueryResponse tripBusinessInstanceQuery(TripBusinessInstanceQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TripBusinessInstanceQueryHeaders headers = new TripBusinessInstanceQueryHeaders();
        return this.tripBusinessInstanceQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询抄送信息</p>
     * 
     * @param request TripCCInfoQueryRequest
     * @param headers TripCCInfoQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TripCCInfoQueryResponse
     */
    public TripCCInfoQueryResponse tripCCInfoQueryWithOptions(TripCCInfoQueryRequest request, TripCCInfoQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessInstanceId)) {
            query.put("business_instance_id", request.businessInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("node_id", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdBusinessId)) {
            query.put("third_business_id", request.thirdBusinessId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TripCCInfoQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/cc"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TripCCInfoQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询抄送信息</p>
     * 
     * @param request TripCCInfoQueryRequest
     * @return TripCCInfoQueryResponse
     */
    public TripCCInfoQueryResponse tripCCInfoQuery(TripCCInfoQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TripCCInfoQueryHeaders headers = new TripCCInfoQueryHeaders();
        return this.tripCCInfoQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批任务列表</p>
     * 
     * @param request TripTaskQueryRequest
     * @param headers TripTaskQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TripTaskQueryResponse
     */
    public TripTaskQueryResponse tripTaskQueryWithOptions(TripTaskQueryRequest request, TripTaskQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessInstanceId)) {
            query.put("business_instance_id", request.businessInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdBusinessId)) {
            query.put("third_business_id", request.thirdBusinessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("user_name", request.userName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TripTaskQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TripTaskQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批任务列表</p>
     * 
     * @param request TripTaskQueryRequest
     * @return TripTaskQueryResponse
     */
    public TripTaskQueryResponse tripTaskQuery(TripTaskQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TripTaskQueryHeaders headers = new TripTaskQueryHeaders();
        return this.tripTaskQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新企业自定义角色</p>
     * 
     * @param request UpdateCustomRoleRequest
     * @param headers UpdateCustomRoleHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomRoleResponse
     */
    public UpdateCustomRoleResponse updateCustomRoleWithOptions(UpdateCustomRoleRequest request, UpdateCustomRoleHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            body.put("role_id", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("role_name", request.roleName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomRole"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/role/v1/customRoles/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新企业自定义角色</p>
     * 
     * @param request UpdateCustomRoleRequest
     * @return UpdateCustomRoleResponse
     */
    public UpdateCustomRoleResponse updateCustomRole(UpdateCustomRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateCustomRoleHeaders headers = new UpdateCustomRoleHeaders();
        return this.updateCustomRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改企业部门</p>
     * 
     * @param tmpReq UpdateDepartmentRequest
     * @param headers UpdateDepartmentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDepartmentResponse
     */
    public UpdateDepartmentResponse updateDepartmentWithOptions(UpdateDepartmentRequest tmpReq, UpdateDepartmentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDepartmentShrinkRequest request = new UpdateDepartmentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.managerEmployeeIdList)) {
            request.managerEmployeeIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.managerEmployeeIdList, "manager_employee_id_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deptName)) {
            body.put("dept_name", request.deptName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerEmployeeIdListShrink)) {
            body.put("manager_employee_id_list", request.managerEmployeeIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outDeptId)) {
            body.put("out_dept_id", request.outDeptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outDeptPid)) {
            body.put("out_dept_pid", request.outDeptPid);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDepartment"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/department/v2/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDepartmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改企业部门</p>
     * 
     * @param request UpdateDepartmentRequest
     * @return UpdateDepartmentResponse
     */
    public UpdateDepartmentResponse updateDepartment(UpdateDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateDepartmentHeaders headers = new UpdateDepartmentHeaders();
        return this.updateDepartmentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新员工信息</p>
     * 
     * @param tmpReq UpdateEmployeeRequest
     * @param headers UpdateEmployeeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEmployeeResponse
     */
    public UpdateEmployeeResponse updateEmployeeWithOptions(UpdateEmployeeRequest tmpReq, UpdateEmployeeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEmployeeShrinkRequest request = new UpdateEmployeeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.baseCityCodeList)) {
            request.baseCityCodeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.baseCityCodeList, "base_city_code_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.certList)) {
            request.certListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.certList, "cert_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customRoleCodeList)) {
            request.customRoleCodeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customRoleCodeList, "custom_role_code_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outDeptIdList)) {
            request.outDeptIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outDeptIdList, "out_dept_id_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatar)) {
            body.put("avatar", request.avatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseCityCodeListShrink)) {
            body.put("base_city_code_list", request.baseCityCodeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.birthday)) {
            body.put("birthday", request.birthday);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certListShrink)) {
            body.put("cert_list", request.certListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customRoleCodeListShrink)) {
            body.put("custom_role_code_list", request.customRoleCodeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAdmin)) {
            body.put("is_admin", request.isAdmin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBoss)) {
            body.put("is_boss", request.isBoss);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDeptLeader)) {
            body.put("is_dept_leader", request.isDeptLeader);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobNo)) {
            body.put("job_no", request.jobNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerUserId)) {
            body.put("manager_user_id", request.managerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outDeptIdListShrink)) {
            body.put("out_dept_id_list", request.outDeptIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.positionLevel)) {
            body.put("position_level", request.positionLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realName)) {
            body.put("real_name", request.realName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realNameEn)) {
            body.put("real_name_en", request.realNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            body.put("user_nick", request.userNick);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEmployee"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/employee/v2/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEmployeeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新员工信息</p>
     * 
     * @param request UpdateEmployeeRequest
     * @return UpdateEmployeeResponse
     */
    public UpdateEmployeeResponse updateEmployee(UpdateEmployeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateEmployeeHeaders headers = new UpdateEmployeeHeaders();
        return this.updateEmployeeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新员工在职状态</p>
     * 
     * @param request UpdateEmployeeLeaveStatusRequest
     * @param headers UpdateEmployeeLeaveStatusHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEmployeeLeaveStatusResponse
     */
    public UpdateEmployeeLeaveStatusResponse updateEmployeeLeaveStatusWithOptions(UpdateEmployeeLeaveStatusRequest request, UpdateEmployeeLeaveStatusHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isLeave)) {
            body.put("is_leave", request.isLeave);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEmployeeLeaveStatus"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/employee/v2/updateLeaveStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEmployeeLeaveStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新员工在职状态</p>
     * 
     * @param request UpdateEmployeeLeaveStatusRequest
     * @return UpdateEmployeeLeaveStatusResponse
     */
    public UpdateEmployeeLeaveStatusResponse updateEmployeeLeaveStatus(UpdateEmployeeLeaveStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateEmployeeLeaveStatusHeaders headers = new UpdateEmployeeLeaveStatusHeaders();
        return this.updateEmployeeLeaveStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>人员查询</p>
     * 
     * @param request UserQueryRequest
     * @param headers UserQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UserQueryResponse
     */
    public UserQueryResponse userQueryWithOptions(UserQueryRequest request, UserQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modifiedTimeGreaterOrEqualThan)) {
            query.put("modified_time_greater_or_equal_than", request.modifiedTimeGreaterOrEqualThan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("page_token", request.pageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartJobNo)) {
            query.put("third_part_job_no", request.thirdPartJobNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/v1/user"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>人员查询</p>
     * 
     * @param request UserQueryRequest
     * @return UserQueryResponse
     */
    public UserQueryResponse userQuery(UserQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UserQueryHeaders headers = new UserQueryHeaders();
        return this.userQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询增值税发票扫描件</p>
     * 
     * @param request VatInvoiceScanQueryRequest
     * @param headers VatInvoiceScanQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return VatInvoiceScanQueryResponse
     */
    public VatInvoiceScanQueryResponse vatInvoiceScanQueryWithOptions(VatInvoiceScanQueryRequest request, VatInvoiceScanQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            query.put("bill_date", request.billDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            query.put("bill_id", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceSubTaskId)) {
            query.put("invoice_sub_task_id", request.invoiceSubTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VatInvoiceScanQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scan/v1/vat-invoice"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VatInvoiceScanQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询增值税发票扫描件</p>
     * 
     * @param request VatInvoiceScanQueryRequest
     * @return VatInvoiceScanQueryResponse
     */
    public VatInvoiceScanQueryResponse vatInvoiceScanQuery(VatInvoiceScanQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        VatInvoiceScanQueryHeaders headers = new VatInvoiceScanQueryHeaders();
        return this.vatInvoiceScanQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询账期待申请的发票数据</p>
     * 
     * @param request WaitApplyInvoiceTaskDetailQueryRequest
     * @param headers WaitApplyInvoiceTaskDetailQueryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return WaitApplyInvoiceTaskDetailQueryResponse
     */
    public WaitApplyInvoiceTaskDetailQueryResponse waitApplyInvoiceTaskDetailQueryWithOptions(WaitApplyInvoiceTaskDetailQueryRequest request, WaitApplyInvoiceTaskDetailQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            query.put("bill_date", request.billDate);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WaitApplyInvoiceTaskDetailQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/wait-apply-task"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WaitApplyInvoiceTaskDetailQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询账期待申请的发票数据</p>
     * 
     * @param request WaitApplyInvoiceTaskDetailQueryRequest
     * @return WaitApplyInvoiceTaskDetailQueryResponse
     */
    public WaitApplyInvoiceTaskDetailQueryResponse waitApplyInvoiceTaskDetailQuery(WaitApplyInvoiceTaskDetailQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        WaitApplyInvoiceTaskDetailQueryHeaders headers = new WaitApplyInvoiceTaskDetailQueryHeaders();
        return this.waitApplyInvoiceTaskDetailQueryWithOptions(request, headers, runtime);
    }
}
